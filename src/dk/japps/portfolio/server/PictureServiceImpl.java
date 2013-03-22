package dk.japps.portfolio.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import dk.japps.portfolio.client.PictureService;
import dk.japps.portfolio.shared.Directory;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class PictureServiceImpl extends RemoteServiceServlet implements PictureService {

	@Override
	public Directory getPictures() {
		return null;
	}

}
