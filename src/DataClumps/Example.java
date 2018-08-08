PROBLEMA: 
connect(String host, int port, String username);




SOLUCIÓN:
class DatabaseCredentials {
  ...
    public String getHost() {
      return host;
    }

  public int getPort() {
    return port;
  }

  public String getUsername() {
    return username;
  }
}

...

connect(DatabaseCredentials databaseCredentials);