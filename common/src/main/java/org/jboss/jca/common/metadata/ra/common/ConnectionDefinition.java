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
package org.jboss.jca.common.metadata.ra.common;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="mailto:stefano.maestri@jboss.org">Stefano Maestri</a>
 *
 */
public class ConnectionDefinition implements IdDecoratedMetadata
{
   /**
    */
   private static final long serialVersionUID = 197264648585424765L;

   private final XsdString managedconnectionfactoryClass;

   private final ArrayList<? extends ConfigProperty> configProperty;

   private final XsdString connectionfactoryInterface;

   private final XsdString connectionfactoryImplClass;

   private final XsdString connectionInterface;

   private final XsdString connectionImplClass;

   private final String id;

   /**
    * @param managedconnectionfactoryClass full qualified name of the class
    * @param configProperty ArrayList of configproperties
    * @param connectionfactoryInterface full qualified name of the factory interface
    * @param connectionfactoryImplClass full qualified name of the factory implementation class
    * @param connectionInterface full qualified name of the connection interface
    * @param connectionImplClass full qualified name of the connection implementation class
    * @param id XML ID
    */
   public ConnectionDefinition(XsdString managedconnectionfactoryClass, ArrayList<? extends ConfigProperty> configProperty,
         XsdString connectionfactoryInterface, XsdString connectionfactoryImplClass, XsdString connectionInterface,
         XsdString connectionImplClass, String id)
   {
      super();
      this.managedconnectionfactoryClass = managedconnectionfactoryClass;
      this.configProperty = configProperty;
      this.connectionfactoryInterface = connectionfactoryInterface;
      this.connectionfactoryImplClass = connectionfactoryImplClass;
      this.connectionInterface = connectionInterface;
      this.connectionImplClass = connectionImplClass;
      this.id = id;
   }

   /**
    * @return managedconnectionfactoryClass
    */
   public XsdString getManagedconnectionfactoryClass()
   {
      return managedconnectionfactoryClass;
   }

   /**
    * @return configProperty
    */
   public List<? extends ConfigProperty> getConfigProperty()
   {
      return Collections.unmodifiableList(configProperty);
   }

   /**
    * @return connectionfactoryInterface
    */
   public XsdString getConnectionfactoryInterface()
   {
      return connectionfactoryInterface;
   }

   /**
    * @return connectionfactoryImplClass
    */
   public XsdString getConnectionfactoryImplClass()
   {
      return connectionfactoryImplClass;
   }

   /**
    * @return connectionInterface
    */
   public XsdString getConnectionInterface()
   {
      return connectionInterface;
   }

   /**
    * @return connectionImplClass
    */
   public XsdString getConnectionImplClass()
   {
      return connectionImplClass;
   }

   /**
    * {@inheritDoc}
    *
    * @see IdDecoratedMetadata#getId()
    */
   @Override
   public String getId()
   {
      return id;
   }

   /**
    * {@inheritDoc}
    *
    * @see java.lang.Object#hashCode()
    */
   @Override
   public int hashCode()
   {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((configProperty == null) ? 0 : configProperty.hashCode());
      result = prime * result + ((connectionImplClass == null) ? 0 : connectionImplClass.hashCode());
      result = prime * result + ((connectionInterface == null) ? 0 : connectionInterface.hashCode());
      result = prime * result + ((connectionfactoryImplClass == null) ? 0 : connectionfactoryImplClass.hashCode());
      result = prime * result + ((connectionfactoryInterface == null) ? 0 : connectionfactoryInterface.hashCode());
      result = prime * result + ((id == null) ? 0 : id.hashCode());
      result = prime * result
            + ((managedconnectionfactoryClass == null) ? 0 : managedconnectionfactoryClass.hashCode());
      return result;
   }

   /**
    * {@inheritDoc}
    *
    * @see java.lang.Object#equals(java.lang.Object)
    */
   @Override
   public boolean equals(Object obj)
   {
      if (this == obj)
      {
         return true;
      }
      if (obj == null)
      {
         return false;
      }
      if (!(obj instanceof ConnectionDefinition))
      {
         return false;
      }
      ConnectionDefinition other = (ConnectionDefinition) obj;
      if (configProperty == null)
      {
         if (other.configProperty != null)
         {
            return false;
         }
      }
      else if (!configProperty.equals(other.configProperty))
      {
         return false;
      }
      if (connectionImplClass == null)
      {
         if (other.connectionImplClass != null)
         {
            return false;
         }
      }
      else if (!connectionImplClass.equals(other.connectionImplClass))
      {
         return false;
      }
      if (connectionInterface == null)
      {
         if (other.connectionInterface != null)
         {
            return false;
         }
      }
      else if (!connectionInterface.equals(other.connectionInterface))
      {
         return false;
      }
      if (connectionfactoryImplClass == null)
      {
         if (other.connectionfactoryImplClass != null)
         {
            return false;
         }
      }
      else if (!connectionfactoryImplClass.equals(other.connectionfactoryImplClass))
      {
         return false;
      }
      if (connectionfactoryInterface == null)
      {
         if (other.connectionfactoryInterface != null)
         {
            return false;
         }
      }
      else if (!connectionfactoryInterface.equals(other.connectionfactoryInterface))
      {
         return false;
      }
      if (id == null)
      {
         if (other.id != null)
         {
            return false;
         }
      }
      else if (!id.equals(other.id))
      {
         return false;
      }
      if (managedconnectionfactoryClass == null)
      {
         if (other.managedconnectionfactoryClass != null)
         {
            return false;
         }
      }
      else if (!managedconnectionfactoryClass.equals(other.managedconnectionfactoryClass))
      {
         return false;
      }
      return true;
   }

   /**
    * {@inheritDoc}
    *
    * @see java.lang.Object#toString()
    */
   @Override
   public String toString()
   {
      return "ConnectionDefinition [managedconnectionfactoryClass=" + managedconnectionfactoryClass
            + ", configProperty=" + configProperty + ", connectionfactoryInterface=" + connectionfactoryInterface
            + ", connectionfactoryImplClass=" + connectionfactoryImplClass + ", connectionInterface="
            + connectionInterface + ", connectionImplClass=" + connectionImplClass + ", id=" + id + "]";
   }

   /**
   *
   * A Tag.
   *
   * @author <a href="stefano.maestri@jboss.com">Stefano Maestri</a>
   *
   */
   public enum Tag
   {
      /** always first
       *
       */
      UNKNOWN(null),

      /**
       * managedconnectionfactory-class TAG
       */
      MANAGED_CONNECTIONFACTORY_CLASS("managedconnectionfactory-class"),

      /**
       * config-property TAG
       */
      CONFIG_PROPERTY("config-property"),

      /**
       * connectionfactory-interface TAG
       */
      CONNECTIONFACTORY_INTERFACE("connectionfactory-interface"),

      /**
       * connectionfactory-impl-class TAG
       */
      CONNECTIONFACTORY_IMPL_CLASS("connectionfactory-impl-class"),

      /**
       * connection-interface TAG
       */
      CONNECTION_INTERFACE("connection-interface"),

      /**
       * connection-impl-class TAG
       */
      CONNECTION_IMPL_CLASS("connection-impl-class");

      private final String name;

      /**
       *
       * Create a new Tag.
       *
       * @param name a name
       */
      Tag(final String name)
      {
         this.name = name;
      }

      /**
       * Get the local name of this element.
       *
       * @return the local name
       */
      public String getLocalName()
      {
         return name;
      }

      private static final Map<String, Tag> MAP;

      static
      {
         final Map<String, Tag> map = new HashMap<String, Tag>();
         for (Tag element : values())
         {
            final String name = element.getLocalName();
            if (name != null)
               map.put(name, element);
         }
         MAP = map;
      }

      /**
      *
      * Static method to get enum instance given localName XsdString
      *
      * @param localName a XsdString used as localname (typically tag name as defined in xsd)
      * @return the enum instance
      */
      public static Tag forName(String localName)
      {
         final Tag element = MAP.get(localName);
         return element == null ? UNKNOWN : element;
      }

   }

   /**
    *
    * A Attribute.
    *
    * @author <a href="stefano.maestri@jboss.com">Stefano Maestri</a>
    *
    */
   public enum Attribute
   {

      /** id attribute
       *
       */
      ID("id");

      private final String name;

      /**
       *
       * Create a new Tag.
       *
       * @param name a name
       */
      Attribute(final String name)
      {
         this.name = name;
      }

      /**
       * Get the local name of this element.
       *
       * @return the local name
       */
      public String getLocalName()
      {
         return name;
      }

   }

}