import org.apache.commons.pool2.impl.DefaultPooledObject;

public class Test
{

	public static void main(String[] args)
	{
		StringBuffer sb = new StringBuffer();
		DefaultPooledObject<StringBuffer> pool = new DefaultPooledObject<StringBuffer>(sb);

	}

}
