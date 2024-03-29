/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/
package lang.ast;

import lang.visitors.Visitor;

public class If extends Cmd{

  private int line, column;
  private Cmd t, e;
  private Expr exp;

  public If(int line, int column, Expr exp, Cmd t, Cmd e)	{
    this.line = line;
    this.column = column;
    this.exp = exp;
    this.t = t;
    this.e = e;
  }

  public If(int line, int column, Expr exp, Cmd t) {
    this.line = line;
    this.column = column;
    this.exp = exp;
    this.t = t;
  }

  public int getLine()  {
    return line;
  }

  public int getColumn()  {
    return column;
  }

  public Expr getExpression()  {
    return exp;
  }

  public Cmd getThen()  {
    return t;
  }

  public Cmd getElse()  {
    return e;
  }

  public void accept(Visitor v) { 
		v.visit(this); 
	}
}