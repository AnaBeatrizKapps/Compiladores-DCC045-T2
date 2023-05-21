/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/
package lang.ast;

import lang.visitors.Visitor;

public class Array extends Access {

	private int line, column;
  private Expr index;

  public Array(int line, int column, Expr index) {
    this.line = line;
    this.column = column;
    this.index = index;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  public Expr getIndex() {
    return index;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
