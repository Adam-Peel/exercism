class Badge {
String idString;
String departmentString;
    
    public String print(Integer id, String name, String department) {

        if (department == null) {
            departmentString = "OWNER";
        } else {
            departmentString = department;
        }
        
        if (id == null ) {
            return name + " - " + departmentString.toUpperCase(); 
        } else {
            idString = "[" + id + "]" + " - ";
        }

      
      return idString + name + " - " + departmentString.toUpperCase(); 
        
    }
}
