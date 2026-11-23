class Badge {
    public String print(Integer id, String name, String department) {
        department = department == null ? "OWNER" : department.toUpperCase();
        String str = "";
        if(id != null) {
            str += "[" + id + "] - ";
        }
        str += name;
        str += " - ";
        str += department;
        
        return str;
    }
}
