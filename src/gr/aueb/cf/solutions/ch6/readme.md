**Get Max Position**  

Αναπτύξτε μία γενική μέθοδο εύρεσης του μέγιστου ενός πίνακα getMaxPosition (int[]
arr, int low, int high) που επιστρέφει τη θέση στον πίνακα arr του μέγιστου
στοιχείου του πίνακα

**Second Min**  

Αναπτύξτε ένα πρόγραμμα που βρίσκει το 2ο μικρότερο στοιχείο ενός πίνακα, το
στοιχείο δηλαδή που είναι αμέσως μεγαλύτερο από το ελάχιστο στοιχείο του πίνακα.
Μη χρησιμοποιήσετε ταξινόμηση. 

**Arrays as Collections**
Έστω ένας πίνακας με στοιχεία ακεραίων της επιλογής σας. Γράψτε
μεθόδους που κάνουν τα παρακάτω:
1. Αναζήτηση ενός στοιχείου στον πίνακα (Επιστρέφει την θέση
του στοιχείου)
2. Φιλτράρισμα των ζυγών (επιστρέφει void, μόνο εκτύπωση των
ζυγών)
3. Mapping κάθε στοιχείου του πίνακα με το διπλάσιο (η μέθοδος
επιστρέφει πίνακα)
4. Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός (η μέθοδος
πρέπει να επιστρέφει boolean)
5. Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί (η
μέθοδος πρέπει να επιστρέφει boolean)


**Lotto App Εξάδες 1 - 49 με φίλτρα**
Ζητήστε από τον χρήστη να εισάγει έξι ακεραίους από
1 έως 49 και ελέγξτε αν αυτή η εξάδα περνάει από τα
παρακάτω φίλτρα (predicates)
1. Δεν έχει πάνω από 3 άρτιους
2. Δεν έχει πάνω από 3 περιττούς
3. Δεν έχει πάνω από 3 συνεχόμενους
4. Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα
5. Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα 

**Low and High Index**
Έστω ένας ταξινομημένος πίνακας με επαναλαμβανόμενα
στοιχεία. Γράψτε μία μέθοδο int[] getLowAndHighIndexOf(int[]
arr, int key) που να υπολογίζει και να επιστρέφει τα low και high
index ενός πίνακα arr, για ένα ακέραιο key που λαμβάνει ως
παράμετρο.
• Γράψτε και μία main() που να βρίσκει το low και high index για
τον πίνακα {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8}. Για παράδειγμα, αν
δώσουμε ως τιμή το 8, θα πρέπει να επιστρέφει {7, 11}.
• Hint. Ελέγξτε αν το key περιέχεται στον πίνακα και σε ποια θέση.
Αν ναι, τότε από τη θέση αυτή μετρήστε τα στοιχεία όσο
υπάρχουν στοιχεία με ίδια τιμή και μέχρι να βρείτε το τέλος του
πίνακα

**Max Cars**
Έστω ένας δισδιάστατος πίνακας που περιέχει τα στοιχεία άφιξης και
αναχώρησης αυτοκινήτων σε μορφή arr[][] = {{1012, 1136}, {1317, 1417},
{1015, 1020}} Αναπτύξτε μία εφαρμογή που διαβάζει να εκτυπώνει τον
μέγιστο αριθμό αυτοκινήτων που είναι σταθμευμένα το ίδιο χρονικό διάστημα.
Για παράδειγμα, στον παραπάνω πίνακα το αποτέλεσμα θα πρέπει να είναι: 2.
Το 1ο αυτοκίνητο αφίχθη στις 10:12 και αναχώρησε στις 11:36, το 3ο
αυτοκίνητο αφίχθη στις 10:15 και αναχώρησε στις 10:20. Επομένως, το 1ο και
το 3ο αυτοκίνητο ήταν παρόντα το ίδιο χρονικό διάστημα.
- Hint. Με βάση τον αρχικό πίνακα, δημιουργήστε ένα δισδιάστατο πίνακα που
σε κάθε γραμμή θα περιέχει δύο πεδία int. Στο πρώτο πεδίο θα εισάγεται η
ώρα άφιξης ή αναχώρησης από τον αρχικό πίνακα και στο 2
ο πεδίο θα
εισάγεται ο αριθμός 1 αν πρόκειται για άφιξη και 0 αν πρόκειται για
αναχώρηση.
- Ταξινομήστε τον πίνακα σε αύξουσα σειρά με βάση την ώρα. Στη συνέχεια
υπολογίστε το μέγιστο αριθμό αυτοκινήτων που είναι σταθμευμένα το ίδιο
χρονικό διάστημα με ένα πέρασμα του πίνακα.
