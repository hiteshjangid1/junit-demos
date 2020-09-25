#Using Data files

1. Data files (csv) must be INSIDE SRC or TEST but OUTSIDE all packages
2. The sample contents

    ```csv
    1, SUNDAY
    2, MONDAY
    3, TUESDAY
    4, WEDNESDAY
    5, THURSDAY
    6, FRIDAY
    7, SATURDAY
    ```

3.  Additional method to read file and convert into collection object

    ```java
   	public static List<Object[]> loadFromFile()throws Exception {
    BufferedReader br=null;
    List<Object[]> data = new LinkedList<Object[]>();
    try {
        //
    InputStream in = WeekSelectorTest.class.getResourceAsStream("/data.csv");
    
    br = new BufferedReader(new InputStreamReader(in));
    String line = br.readLine();
    while(line!=null) {
        ///USE SEPERATOR for SPLITTING
        String[] temp = line.split(",");
        //USE .trim() to remove unwanted SPACES before and after string value
        data.add(new Object[]{Integer.parseInt(temp[0]),temp[1].trim()});
        line = br.readLine();
    }
    }catch(IOException ex) {
        System.out.println("Unable to read the file!");
    }finally {
        try {
            if(br!=null)
                br.close();
        }catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    return data;
    
	}

    ```
4.  Modify the parameters method

    ```java
    @Parameters
	public static Collection weekData() {
		try {
			return loadFromFile();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	
	}
    ```