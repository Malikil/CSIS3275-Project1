package Server;

import java.io.Serializable;

public class User implements Comparable<User>, Serializable
{
	private String username;
	private String password;
	private boolean admin;
	private AVLTree<String> databases;
	
	public String getUsername() { return username; }
	public String getPassword() { return password; }
	public String[] getDatabases() {
		return databases.toArray(databases.toArray(new String[databases.size()]));
	}
	
	public void setPassword(String newPass) { password = newPass; }
	public boolean isAdmin() { return admin; }
	
	public User(String uName, String pWord, String[] dBases, boolean admin)
	{
		username = uName.toLowerCase();
		password = pWord;
		databases = new AVLTree<String>();
		for(int i = 0; i < dBases.length ; i++)
			databases.add(dBases[i]);
		this.admin = admin;
	}
	
	public User(String uName, String pWord, String[] databases)
	{
		this(uName, pWord, databases, false);
	}
	
	public User(String uName)
	{
		username = uName.toLowerCase();
	}
	/*
	public User(User newUser, String[] dBases) 
	{
		this(newUser.getUsername(),newUser.getPassword(),dBases);
	}
	
	public User(User newUser, String pWord)
	{
		this(newUser.getUsername(),pWord,newUser.getDatabases());
	}
	*/
	public void addDatabases(String[] newDBList)
	{
		for(int i = 0; i < newDBList.length; i++)
		{
			databases.add(newDBList[i]);
		}
	}
	
	public void addNewDatabase(String newDB)
	{

			databases.add(newDB);

	}
	
	public void changeDatabase(String[] newDBList)
	{
		AVLTree<String> newDBs = new AVLTree<String>();
		for(int i = 0 ; i < newDBList.length ; i++)
			newDBs.add(newDBList[i]);
		databases = newDBs;
	}
	
	public boolean deleteDatabase(String databaseToDelete)
	{
		return databases.delete(databaseToDelete);
	}
	
	@Override
	public int compareTo(User user)
	{
		return username.compareTo(user.getUsername());
	}
	
	public boolean equals(User user)
	{
		if (username.equals(user.getUsername()))
			if (password.equals(user.getPassword()))
				return true;
		return false;
	}
}
