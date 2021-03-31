package week7playlist;

import java.util.ArrayList;

public class Playlist implements IComponent
{
	private String playlistName;
	private ArrayList< IComponent > playlist = new ArrayList< IComponent >();

	public Playlist(
			String playlistName
	)
	{
		this.playlistName = playlistName;
	}

	@Override public void play()
	{
		System.out.println( "@Override public void play()" );
	}

	@Override public void setPlaybackSpeed(
			float speed
	)
	{
		for( IComponent ic: this.playlist )
			ic.setPlaybackSpeed( speed );
	}

	@Override public String getName()
	{
		return this.playlistName;
	}

	public void add(
			Song synthPopSong1
	)
	{
		this.playlist.add( synthPopSong1 );
	}

	public void add(
			Playlist pl
	)
	{
		this.playlist.add( pl );
	}
}