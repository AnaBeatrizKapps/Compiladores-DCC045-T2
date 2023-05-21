/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/
package lang.ast;

import lang.visitors.Visitor;

public class Read extends Cmd{

  private int line, column;
  private LValue lvalue;

  public Read(int line, int column, LValue lvalue)	{
    this.line = line;
    this.column = column;
    this.lvalue = lvalue;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  public LValue getValue() {
    return lvalue;
  }

  public void accept(Visitor v) { 
		v.visit(this); 
	}
}