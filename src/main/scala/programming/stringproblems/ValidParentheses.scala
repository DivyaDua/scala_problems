package programming.stringproblems

import scala.annotation.tailrec
import scala.collection.immutable.Map
import scala.collection.mutable

object ValidParentheses extends App {
    
    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     *
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     *
     * @param s string to check
     * @return true if string is valid else false
     */
    def isValidParenthesesUsingVar(s: String): Boolean = {
        val stack: mutable.Stack[Char] = mutable.Stack()
        val bracesMap = Map(')' -> '(', '}' -> '{', ']' -> '[')
        var flag: Boolean = true
        s.foreach(x => {
            if (x == '(' | x == '{' | x == '[')
                stack.push(x)
            else {
                if (stack.isEmpty)
                    flag = false
                else {
                    val y = stack.pop()
                    if (y != bracesMap(x))
                        flag = false
                }
            }
        })
        
        if (!flag)
            return flag
        if (stack.isEmpty)
            true
        else
            false
    }
    
    def isValidParentheses(s: String): Boolean = {
        val stack: mutable.Stack[Char] = mutable.Stack()
        
        @tailrec
        def checkParentheses(iter: Int, stack: mutable.Stack[Char]): Boolean = {
            if (iter >= s.length)
                stack.isEmpty
            else {
                s.charAt(iter) match {
                    case c@('(' | '[' | '{') => checkParentheses(iter + 1, stack.push(c))
                    case ')' if stack.isEmpty || stack.head != '(' => false
                    case ']' if stack.isEmpty || stack.head != '[' => false
                    case '}' if stack.isEmpty || stack.head != '{' => false
                    case _ =>
                        stack.pop()
                        checkParentheses(iter + 1, stack)
                }
            }
        }
        
        checkParentheses(0, stack)
    }
    
    println(isValidParentheses("()"))
    println(isValidParentheses("([]){}"))
    println(isValidParentheses("(]"))
}