/**
 * Copyright 2000-present Liferay, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package tj.language;

import com.liferay.portal.kernel.util.AggregateResourceBundleLoader;
import com.liferay.portal.kernel.util.CacheResourceBundleLoader;
import com.liferay.portal.kernel.util.ClassResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleLoader;

import java.util.ResourceBundle;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author APP
 */
@Component(
	immediate = true,
	property = {
		"bundle.symbolic.name=com.liferay.blogs.web",
		"resource.bundle.base.name=content.Language",
		"servlet.context.name=blogs-web"
	}
)
public class CustomLanguageComponent implements ResourceBundleLoader {

	@Override
	public ResourceBundle loadResourceBundle(String languageId) {
		return _resourceBundleLoader.loadResourceBundle(languageId);
	}

	@Reference(target = "(&(bundle.symbolic.name=com.liferay.blogs.web)(!(component.name=com.liferay.blade.samples.hook.resourcebundle.ResourceBundleLoaderComponent)))")
	public void setResourceBundleLoader(
		ResourceBundleLoader resourceBundleLoader) {

		_resourceBundleLoader = new AggregateResourceBundleLoader(
			new CacheResourceBundleLoader(
				new ClassResourceBundleLoader(
					"content.Language",
					CustomLanguageComponent.class.getClassLoader())),
			resourceBundleLoader);
	}

	private AggregateResourceBundleLoader _resourceBundleLoader;

}


/*
 package tj.language;
 

import java.util.Enumeration;
import java.util.ResourceBundle;
import org.osgi.service.component.annotations.Component;
import com.liferay.portal.kernel.language.UTF8Control;

@Component(
 property = { "language.id=en_US",
		       "language.id=ru_RU"}, 
 service = ResourceBundle.class
)
public class CustomLanguageComponent extends ResourceBundle {
 
ResourceBundle bundle = ResourceBundle.getBundle("content.Language", UTF8Control.INSTANCE);

 @Override
 protected Object handleGetObject(String key) {
 System.out.println("getting key"+key);
 return bundle.getObject(key);
 }

 @Override
 public Enumeration<String> getKeys() {
 return bundle.getKeys();
 }

}

*/