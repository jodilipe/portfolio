package dk.japps.portfolio.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import dk.japps.portfolio.shared.Directory;

/**
 * The async counterpart of <code>PictureService</code>.
 */
public interface PictureServiceAsync {
	void getPictures(AsyncCallback<Directory> callback);
}
