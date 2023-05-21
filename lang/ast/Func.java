/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/
package lang.ast;

import lang.visitors.Visitor;

public class Func extends SuperNode {

  private int line, column;
  private String id;
  private Type[] ret;
  private Param[] p;
  private Cmd[] c;


  public Func(int line, int column, String id, Param[] p, Type[] ret, Cmd[] c) {
    this.id = id;
    this.ret = ret;
    this.p = p;
    this.c = c;
    this.line = line;
    this.column = column;
  }

  public int getLine() {
    return line;
  }

  public int getColumn() {
    return column;
  }

  public String getID() {
    return id;
  }

  public Type[] getTypeReturn() {
    return ret;
  }

  public Param[] getParam() {
    return p;
  }

  public Cmd[] getBody() {
    return c;
  }

  public void accept(Visitor v) {
    v.visit(this);
  }
}
