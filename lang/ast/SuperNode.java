/*

Grupo

Nome: Ana Beatriz Kapps dos Reis
Matrícula: 201835006

Nome: Marluce Aparecida Vitor
Matrícula: 201935500

*/

package lang.ast;

import lang.visitors.Visitable;

public abstract class SuperNode implements Visitable {
    public SuperNode() { }
    public abstract int getLine();
    public abstract int getColumn();
}


