//The API is relatively straight forward

try {
  URL url = new URL("http://www.vogella.com");
  HttpURLConnection con = (HttpURLConnection) url
    .openConnection();
  readStream(con.getInputStream());
  } catch (Exception e) {
  e.printStackTrace();
}



private void readStream(InputStream in) {
  BufferedReader reader = null;
  try {
    reader = new BufferedReader(new InputStreamReader(in));
    String line = "";
    while ((line = reader.readLine()) != null) {
      System.out.println(line);
    }
  } catch (IOException e) {
    e.printStackTrace();
  } finally {
    if (reader != null) {
      try {
        reader.close();
      } catch (IOException e) {
        e.printStackTrace();
        }
    }
  }
} 
