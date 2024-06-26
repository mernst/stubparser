/*
 * Copyright (C) 2007-2010 Júlio Vilmar Gesser.
 * Copyright (C) 2011, 2013-2024 The JavaParser Team.
 *
 * This file is part of JavaParser.
 *
 * JavaParser can be used either under the terms of
 * a) the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 * b) the terms of the Apache License
 *
 * You should have received a copy of both licenses in LICENCE.LGPL and
 * LICENCE.APACHE. Please refer to those files for details.
 *
 * JavaParser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 */

package com.github.javaparser.metamodel;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.github.javaparser.ast.expr.StringLiteralExpr;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class TestMetaModel extends BaseNodeMetaModel {

    public TestMetaModel() {
        super(Optional.empty(), StringLiteralExpr.class, "stri", "com.japa", true, true);
    }
}

class BaseNodeMetaModelTest {
    @Test
    void testGetters() {
        TestMetaModel test = new TestMetaModel();

        assertEquals("testMetaModel", test.getMetaModelFieldName());
    }
}
