package tj.schedulars;

import com.liferay.portal.kernel.messaging.Message;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.portal.kernel.messaging.MessageListenerException;

public class IzvewenijaSchedulars implements MessageListener {

	@Override
	public void receive(Message message) throws MessageListenerException {
		
		System.out.println("izvewenija schedular");

	
	}
	
		
	}


