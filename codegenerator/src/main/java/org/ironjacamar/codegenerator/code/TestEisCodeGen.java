/*
 *  IronJacamar, a Java EE Connector Architecture implementation
 *  Copyright 2016, Red Hat Inc, and individual contributors
 *  as indicated by the @author tags. See the copyright.txt file in the
 *  distribution for a full listing of individual contributors.
 *
 *  This is free software; you can redistribute it and/or modify it
 *  under the terms of the Eclipse Public License 1.0 as
 *  published by the Free Software Foundation.
 *
 *  This software is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse
 *  Public License for more details.
 *
 *  You should have received a copy of the Eclipse Public License
 *  along with this software; if not, write to the Free
 *  Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 *  02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.ironjacamar.codegenerator.code;

import org.ironjacamar.codegenerator.Definition;

import java.io.IOException;
import java.io.Writer;

/**
 * A Test CodeGen.
 *
 * @author Jeff Zhang
 * @version $Revision: $
 */
public class TestEisCodeGen extends AbstractCodeGen
{

   /**
    * Output class
    *
    * @param def definition
    * @param out Writer
    * @throws IOException ioException
    */
   @Override
   public void writeClassBody(Definition def, Writer out) throws IOException
   {
      out.write("/** Echo handler */\n");
      out.write("public class " + getClassName(def) + " implements Handler");
      writeLeftCurlyBracket(out, 0);

      int indent = 1;
      writeDefaultConstructor(def, out, indent);

      writeHandle(def, out, indent);

      writeRightCurlyBracket(out, 0);
   }

   /**
    * Output class import
    *
    * @param def definition
    * @param out Writer
    * @throws IOException ioException
    */
   @Override
   public void writeImport(Definition def, Writer out) throws IOException
   {
      out.write("package " + def.getRaPackage() + ";\n\n");
      out.write("import org.ironjacamar.eis.Handler;\n\n");
      out.write("import java.io.InputStream;\n");
      out.write("import java.io.OutputStream;\n\n");
   }

   /**
    * get this class name
    *
    * @param def definition
    * @return String class name
    */
   @Override
   public String getClassName(Definition def)
   {
      return def.getDefaultValue() + "Handler";
   }

   /**
    * Output handle method
    *
    * @param def    definition
    * @param out    Writer
    * @param indent space number
    * @throws IOException ioException
    */
   private void writeHandle(Definition def, Writer out, int indent) throws IOException
   {
      writeSimpleMethodSignature(out, indent, " * {@inheritDoc}",
            "public void handle(InputStream is, OutputStream os)");
      writeLeftCurlyBracket(out, indent);

      writeWithIndent(out, indent + 1, "// TODO: Implement me");
      writeRightCurlyBracket(out, indent);
   }
}
