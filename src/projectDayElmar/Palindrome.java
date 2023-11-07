package projectDayElmar;

class CaseInsensitiveCharArrayPalindromeChecker {
            public static void main(String[] args) {
                char[] charArray = { 'R', 'a', 'C', 'E', 'c', 'A', 'r' };

                boolean isPalindrome = isCaseInsensitivePalindrome(charArray);

                if (isPalindrome) {
                    System.out.println("The given character array is a case-insensitive palindrome.");
                } else {
                    System.out.println("The given character array is not a case-insensitive palindrome.");
                }
            }

            // Function to check if a character array is a case-insensitive palindrome
            static boolean isCaseInsensitivePalindrome(char[] arr) {
                int left = 0;
                int right = arr.length - 1;

                while (left < right) {
                    // Convert characters to lowercase manually before comparing
                    char leftChar = toLowerCase(arr[left]);
                    char rightChar = toLowerCase(arr[right]);

                    if (leftChar != rightChar) {
                        return false;
                    }

                    left++;
                    right--;
                }

                return true;
            }

            // Manual lowercase conversion function
            static char toLowerCase(char c) {
                if (c >= 'A' && c <= 'Z') {
                    return (char) (c + 32); // Convert uppercase to lowercase
                }
                return c;
            }
        }




