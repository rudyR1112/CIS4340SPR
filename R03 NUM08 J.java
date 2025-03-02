double currentBalance; // User's cash balance
 
void doDeposit(String userInput) {
  double val = 0;
  try {
    val = Double.valueOf(userInput);
  } catch (NumberFormatException e) {
    // Handle input format error
  }
 
  if (val >= Double.MAX_VALUE - currentBalance) {
    // Handle range error
  }
 
  currentBalance += val;
}
