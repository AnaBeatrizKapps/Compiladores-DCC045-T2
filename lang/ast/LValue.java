/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/
package lang.ast;

import lang.visitors.Visitor;
import java.util.*;

public class LValue extends Expr {

  private int line, column;
  private String id;
  private ArrayList<Access> s;

  public LValue(int line, int column, String id) {
    this.line = line;
    this.column = column;
    this.id = id;
    this.s = new ArrayList<Access>();
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

  public ArrayList<Access> getAccess() {
    return s;
  }

  public void add(Access x) {
    s.add(x);
  }

  public void accept(Visitor v) {
    v.visit(this);
  }

}
