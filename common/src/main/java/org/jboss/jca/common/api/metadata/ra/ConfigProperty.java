/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.jca.common.api.metadata.ra;


import org.jboss.jca.common.api.metadata.CopyableMetaData;

import java.util.List;

/**
 *
 * A ConfigProperty.
 *
 * @author <a href="stefano.maestri@jboss.com">Stefano Maestri</a>
 *
 */
public interface ConfigProperty extends IdDecoratedMetadata, CopyableMetaData
{

   /**
    * @return description
    */
   public abstract List<LocalizedXsdString> getDescriptions();

   /**
    * @return configPropertyName
    */
   public abstract XsdString getConfigPropertyName();

   /**
    * @return configPropertyType
    */
   public abstract XsdString getConfigPropertyType();

   /**
    * @return configPropertyValue
    */
   public abstract XsdString getConfigPropertyValue();

   /**
    * {@inheritDoc}
    *
    * @see IdDecoratedMetadata#getId()
    */
   @Override
   public abstract String getId();

   /**
    *
    * convenient method t verify if the value has already been set
    *
    * @return true if vaue has been set
    */
   public abstract boolean isValueSet();

}