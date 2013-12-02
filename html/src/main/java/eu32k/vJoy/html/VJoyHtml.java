package eu32k.vJoy.html;

import eu32k.vJoy.core.VJoy;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;

public class VJoyHtml extends GwtApplication {
	@Override
	public ApplicationListener getApplicationListener () {
		return new VJoy();
	}
	
	@Override
	public GwtApplicationConfiguration getConfig () {
		return new GwtApplicationConfiguration(480, 320);
	}
}
