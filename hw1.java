package cs132hw1;

public class ParserTest
{
	// general tests
	String testInput1 = 
	"$1 + \n(1 - ++$2) $#(a confusing comment)\n3";
	String testOutput1 =
	"1 $ 1 2 $ ++_ - + 3 $ _";
	
	String testInput2 =
	"1+++2";
	String testOutput2 =
	"1 _++ 2 +";
	
	String testInput3 =
	"(1)";
	String testOutput3 =
	"1";
	
	String testInput4 =
	"12";
	String testOutput4 =
	"1 2 _";
	
	String testInput5 =
	"++1++1";
	String testOutput5 =
	"1 _++ ++_ 1 _";
	
	String testInput6 =
	"1-++--2";
	String testOutput6 =
	"1 2 --_ ++_ -";
	
	String testInput7 =
	"1++1++1";
	String testOutput7 =
	"1 _++ 1 _++ _ 1 _";
	
	String testInput8 =
	"1+23+4";
	String testOutput8 =
	"1 2 + 3 4 + _";
	
	// tests for precedence: test each layer of precedence one by one
	// except the last two tests the highest with the lowest
	String testInputPrecedence1 =
	"$1++";
	String testOutputPrecedence1 =
	"1 $ _++";
	
	String testInputPrecedence2 =
	"++1++";
	String testOutputPrecedence2 =
	"1 _++ ++_";
	
	String testInputPrecedence3 =
	"1+ ++2";
	String testOutputPrecedence3 =
	"1 2 ++_ +";
	
	String testInputPrecedence4 =
	"12+3";
	String testOutputPrecedence4 =
	"1 2 3 + _";
	
	String testInputPrecedence5 =
	"1$2";
	String testOutputPrecedence5 =
	"1 2 $ _";
	
	String testInputPrecedence6 =
	"1++--2";
	String testOutputPrecedence6 =
	"1 _++ _-- 2 _";
	
	// tests for parentheses
	String testInputParenthsisWithFieldReference =
	"$(1+2)";
	String testOutputParenthsisWithFieldReference =
	"1 2 + $";
	
	String testInputWithNestedParentheses =
	"(++(12))++";
	String testOutputWithNestedParentheses =
	"1 2 _ ++_ _++";
	
	// tests for errors: these test cases should throw error messages
	String testInputError1 = 
	"1+++"; // binary operator has no operand
	String testInputError2 =
	"+1"; // expression cannot start with binary operator
	String testInputError3 =
	"$";
	String testInputError4 =
	"++";
	String testInputError5 =
	"+";
	String testInputError6 =
	"";
	String testInputError7 =
	"$+2";
	String testInputError8 =
	"1(+2)"; // parentheses in wrong locations
}
