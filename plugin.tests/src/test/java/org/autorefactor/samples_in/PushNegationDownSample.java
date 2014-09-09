/*
 * AutoRefactor - Eclipse plugin to automatically refactor Java code bases.
 *
 * Copyright (C) 2014 Jean-Noël Rouvignac - initial API and implementation
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program under LICENSE-GNUGPL.  If not, see
 * <http://www.gnu.org/licenses/>.
 *
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution under LICENSE-ECLIPSE, and is
 * available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.autorefactor.samples_in;


public class PushNegationDownSample {

    public boolean replaceDoubleNegation(boolean b) {
        return !!b;
    }

    public boolean replaceDoubleNegationWithParentheses(boolean b) {
        return !(!(b /* another refactoring removes the parentheses */));
    }

    public boolean replaceNegationWithInfixAndOperator(boolean b1, boolean b2) {
        return !(b1 && b2); // another refactoring removes the parentheses
    }

    public boolean replaceNegationRevertInnerExpressions(boolean b1, boolean b2) {
        return !(!b1 && !b2 /* another refactoring removes the parentheses */);
    }

    public boolean replaceNegationLeaveParentheses(boolean b1, boolean b2) {
        return !(!(b1 && b2 /* another refactoring removes the parentheses */));
    }

    public boolean replaceNegationRemoveParentheses(boolean b1, boolean b2) {
        return !((!b1) && (!b2));
    }

    public boolean doNotNegateNonBooleanExprs(Object o1) {
        return !(o1 != null /* another refactoring removes the parentheses */);
    }
}
