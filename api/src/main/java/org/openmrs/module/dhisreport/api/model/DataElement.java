/**
 *  Copyright 2009 Society for Health Information Systems Programmes, India (HISP India)
 *
 *  This file is part of DHISReporting module.
 *
 *  Billing module is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.

 *  Billing module is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with Billing module.  If not, see <http://www.gnu.org/licenses/>.
 *
 **/

package org.openmrs.module.dhisreport.api.model;


import java.io.Serializable;
import org.openmrs.BaseOpenmrsMetadata;

/**
 *
 * @author bobj
 */
public class DataElement extends BaseOpenmrsMetadata implements Serializable {
    
    protected Integer id;
    
    protected String code;
    
    protected String uid;
    
    protected String name;

    public String getUid()
    {
        return uid;
    }

    public void setUid( String uid )
    {
        this.uid = uid;
    }

    public String getCode()
    {
        return code;
    }

    public void setCode( String code )
    {
        this.code = code;
    }

    @Override
    public Integer getId()
    {
        return id;
    }

    @Override
    public void setId( Integer id )
    {
        this.id = id;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void setName( String name )
    {
        this.name = name;
    }

    @Override
    public boolean equals( Object obj )
    {
        if ( obj == null )
        {
            return false;
        }
        if ( getClass() != obj.getClass() )
        {
            return false;
        }
        final DataElement other = (DataElement) obj;
        if ( ( this.code == null ) ? ( other.code != null ) : !this.code.equals( other.code ) )
        {
            return false;
        }
        if ( ( this.uid == null ) ? ( other.uid != null ) : !this.uid.equals( other.uid ) )
        {
            return false;
        }
        if ( ( this.name == null ) ? ( other.name != null ) : !this.name.equals( other.name ) )
        {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 89 * hash + ( this.code != null ? this.code.hashCode() : 0 );
        hash = 89 * hash + ( this.uid != null ? this.uid.hashCode() : 0 );
        hash = 89 * hash + ( this.name != null ? this.name.hashCode() : 0 );
        return hash;
    }

}
