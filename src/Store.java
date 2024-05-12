public class Store {

    private Tablet[] tablets;
    private int[] systems;
    public Store()
    {
        tablets = new Tablet[1000];
        systems = new int[3];
    }

    public Tablet[] getTablets() {
        return tablets;
    }

    public void setTablets(Tablet[] tablets) {
        this.tablets = tablets;
    }

    public int[] getSystems() {
        return systems;
    }

    public void setSystems(int[] systems) {
        this.systems = systems;
    }

   public boolean addTablet(Tablet tab) {
       int count = 0;
       for (int i = 0; i < tablets.length; i++) {
           if (tablets[i] == null) {
               count++;
           }
       }
           if (count == 0) {
               return false;
           } else {
               int count1 = 0;
               for (int j = 0; j < tablets.length; j++) {
                   if (tablets[j] != null&&tablets[j].isSame(tab)) {
                       tablets[j].setPrice(tab.getPrice());
                       count1++;
                       return true;
                   }
               }
               if (count1 == 0) {
                   tablets[tablets.length - count] = tab;
                   if (tab.getSystem() == 'W') {
                       systems[0] += 1;
                   } else if (tab.getSystem() == 'A') {
                       systems[1] += 1;
                   } else if (tab.getSystem() == 'I') {
                       systems[2] += 1;
                   }
                   return true;
               }
           }
           return false;
       }

       public int sortStore(){
        Tablet [] tabletsSort = new Tablet[this.tablets.length];
        int k=0;
        for (int i=0;i< tablets.length;i++){
            if (tablets[i] != null &&  tablets[i].getSystem() == 'W'){
                tabletsSort[k] = tablets[i];
                k++;
            }
        }
        for (int i=0;i<tablets.length;i++){
            if (tablets[i] != null &&tablets[i].getSystem() == 'A'){
                tabletsSort[k] = tablets[i];
                k++;
            }
        }
        for (int i=0;i<tablets.length;i++){
            if (tablets[i] != null &&tablets[i].getSystem() == 'I'){
                tabletsSort[k] = tablets[i];
                k++;
            }
        }
           return tablets.length-k;
       }
   }

