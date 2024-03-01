package project.FacultyManager;

import java.util.HashMap;

public class FacultyManager {
    private static HashMap<String, Faculty> facultyDetails = new HashMap<>();

    static {
    	facultyDetails.put("5001", new Faculty("5001", "kmit", "A"));
    	facultyDetails.put("5002", new Faculty("5002", "kmit", "A"));
    	facultyDetails.put("5003", new Faculty("5003", "kmit", "A"));
    	facultyDetails.put("5004", new Faculty("5004", "kmit", "A"));
    	facultyDetails.put("5005", new Faculty("5005", "kmit", "D"));
    	facultyDetails.put("5006", new Faculty("5006", "kmit", "D"));
    	facultyDetails.put("5007", new Faculty("5007", "kmit", "D"));
    	facultyDetails.put("5008", new Faculty("5008", "kmit", "F"));
    	facultyDetails.put("5009", new Faculty("5009", "kmit", "F"));
    	facultyDetails.put("5010", new Faculty("5010", "kmit", "G"));
    	facultyDetails.put("5011", new Faculty("5011", "kmit", "G"));
    	facultyDetails.put("5012", new Faculty("5012", "kmit", "G"));
    	facultyDetails.put("5013", new Faculty("5013", "kmit", "A"));
    	facultyDetails.put("5014", new Faculty("5014", "kmit", "B"));
    	facultyDetails.put("5015", new Faculty("5015", "kmit", "C"));
    	facultyDetails.put("5016", new Faculty("5016", "kmit", "D"));
    	facultyDetails.put("5017", new Faculty("5017", "kmit", "E"));
    	facultyDetails.put("5018", new Faculty("5018", "kmit", "F"));
    	facultyDetails.put("5019", new Faculty("5019", "kmit", "G"));
    	facultyDetails.put("5020", new Faculty("5020", "kmit", "A"));
    	facultyDetails.put("5021", new Faculty("5021", "kmit", "B"));
    	facultyDetails.put("5022", new Faculty("5022", "kmit", "C"));
    	facultyDetails.put("5023", new Faculty("5023", "kmit", "D"));
    	facultyDetails.put("5024", new Faculty("5024", "kmit", "E"));
    	facultyDetails.put("5025", new Faculty("5025", "kmit", "F"));
    	facultyDetails.put("5026", new Faculty("5026", "kmit", "G"));
    	facultyDetails.put("5027", new Faculty("5027", "kmit", "A"));
    	facultyDetails.put("5028", new Faculty("5028", "kmit", "B"));
    	facultyDetails.put("5029", new Faculty("5029", "kmit", "C"));
    	facultyDetails.put("5030", new Faculty("5030", "kmit", "D"));
    	facultyDetails.put("5031", new Faculty("5031", "kmit", "E"));
    	facultyDetails.put("5032", new Faculty("5032", "kmit", "F"));
    	facultyDetails.put("5033", new Faculty("5033", "kmit", "G"));
    	facultyDetails.put("5034", new Faculty("5034", "kmit", "A"));
    	facultyDetails.put("5035", new Faculty("5035", "kmit", "B"));
    	facultyDetails.put("5036", new Faculty("5036", "kmit", "C"));
    	facultyDetails.put("5037", new Faculty("5037", "kmit", "D"));
    	facultyDetails.put("5038", new Faculty("5038", "kmit", "E"));
    	facultyDetails.put("5039", new Faculty("5039", "kmit", "F"));
    	facultyDetails.put("5040", new Faculty("5040", "kmit", "G"));
    	facultyDetails.put("5555", new Faculty("5555","kmit","H"));

    }

    public static Faculty getFacultyById(String facultyId) {
        return facultyDetails.get(facultyId);
    }
    static class Faculty {
        private String id;
        private String password;
        private String section;

        public Faculty(String id, String password, String section) {
            this.id = id;
            this.password = password;
            this.section = section;
        }

        public String getId() {
            return id;
        }

        public String getPassword() {
            return password;
        }

        public String getSection() {
            return section;
        }
    }
}
