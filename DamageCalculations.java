public interface DamageCalculations{
     default int calculateHeal(){
               return 0;
     }
     default  int calculateDefense(){
               return 0;
     }
     default int calculateDamage(){
               return 0;
     }
}