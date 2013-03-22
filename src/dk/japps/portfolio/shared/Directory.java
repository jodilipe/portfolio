package dk.japps.portfolio.shared;

import java.util.List;

public class Directory {
	private List<Directory> directories;
	private List<Picture> pictures;

	public List<Directory> getDirectories() {
		return directories;
	}

	public void setDirectories(List<Directory> directories) {
		this.directories = directories;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}
}
