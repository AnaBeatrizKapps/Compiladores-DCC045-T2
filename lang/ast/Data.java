/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/
package lang.ast;

import lang.visitors.Visitor;

public class Data extends SuperNode
{
  private int line, column;
  private String id;
  private Decl[] types;

  public Data(int line, int column, String id, Decl[] types) {
    this.line = line;
    this.column = column;
    this.id = id;
    this.types = types;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  public String getId() {
    return id;
  }

  public Decl[] getTypes() {
    return types;
  }


  public void accept(Visitor v) { 
		v.visit(this); 
	}
}