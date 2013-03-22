package dk.japps.portfolio.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import dk.japps.portfolio.shared.Directory;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("picture")
public interface PictureService extends RemoteService {
	Directory getPictures();
}
