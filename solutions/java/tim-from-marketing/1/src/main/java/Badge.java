class Badge {
    public String print(Integer id, String name, String department) {
        department = department == null ? "OWNER" : department.toUpperCase();
        if(id == null){
            return "%s - %s".formatted(name,department);
        }else{
            return "[%d] - %s - %s".formatted(id,name,department);
        }
    }
}
