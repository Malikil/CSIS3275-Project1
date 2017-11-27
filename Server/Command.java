package Server;

public enum Command {
	MESSAGE, GET_TABLE_NAMES, DATABASE_LIST, 
	TABLE_LIST, GET_ACTUAL_TABLE, ADD_TABLE, DELETE_TABLE,
	ADD_USER, DELETE_USER, SELECT_USER,
	ADD_ENTRY, DELETE_ENTRY, EDIT_ENTRY,
	ADD_COLUMNS, DELETE_COLUMN, 
	ADD_DATABASE, DELETE_DATABASE,
	CONNECTION_SUCCESS, INCORRECT_USER, INCORRECT_PASSWORD, LOGIN,
}