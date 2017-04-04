import java.util.HashMap;
        import java.util.LinkedList;

public class EightQueensHill {

    public HashMap<String, Integer> conflicts;
    public LinkedList<String>position;

    public EightQueensHill(){
        conflicts = new HashMap<String, Integer>();
        position = new LinkedList<String>();
    }
    private void addNewQueen(){
        int j = position.getLast().charAt(1);
        int newcol = j +1;
        int minconf = Integer.MAX_VALUE;
        String suitablepos = "";
        for(int i = 0; i< 8; i++){
            String check = i+j+"";
            int checkconf = 0;
            if(conflicts.containsKey(check)){
                checkconf = getConflict(check);
                if(checkconf< minconf){
                    minconf = checkconf;
                    suitablepos = check;
                }
            }else {
                continue;
            }
        }
        position.addLast(suitablepos);
        updateConflicts();
    }
    private void updateConflicts() {
        if (position.isEmpty()) {
            for (int i = 0; i < 8; i++) {
                String temp = i + "0";
                conflicts.put(temp, 0);
            }
        }else{
            int newcol =  position.getLast().charAt(1);
            for(int i = 0; i <8; i++){

            }
        }

    }
    private void checkRow(int i){
        for(int j = 0; j< position.size(); j++){
            if
        }
    }
    private int getConflict(String check){
        return conflicts.get(check);
    }

}
