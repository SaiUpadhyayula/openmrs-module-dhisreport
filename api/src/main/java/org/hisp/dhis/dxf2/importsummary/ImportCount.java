package org.hisp.dhis.dxf2.importsummary;

/*
 * Copyright (c) 2011, University of Oslo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 * * Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 * * Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 * * Neither the name of the HISP project nor the names of its contributors may
 *   be used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 * ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
public class ImportCount
{
    @XmlAttribute(required = true)
    private int imported;

    @XmlAttribute(required = true)
    private int updated;

    @XmlAttribute(required = true)
    private int ignored;

    public ImportCount()
    {
    }

    public ImportCount( int imported, int updated, int ignored )
    {
        this.imported = imported;
        this.updated = updated;
        this.ignored = ignored;
    }

    public int getImported()
    {
        return imported;
    }

    public void setImported( int imported )
    {
        this.imported = imported;
    }

    public int getUpdated()
    {
        return updated;
    }

    public void setUpdated( int updated )
    {
        this.updated = updated;
    }

    public int getIgnored()
    {
        return ignored;
    }

    public void setIgnored( int ignored )
    {
        this.ignored = ignored;
    }

    @Override
    public String toString()
    {
        return "[imports=" + imported + ", updates=" + updated + ", ignores=" + ignored + "]";
    }

    public void incrementImported()
    {
        imported++;
    }

    public void incrementUpdated()
    {
        updated++;
    }

    public void incrementIgnored()
    {
        ignored++;
    }

    public void incrementImported( int n )
    {
        imported += n;
    }

    public void incrementUpdated( int n )
    {
        updated += n;
    }

    public void incrementIgnored( int n )
    {
        ignored += n;
    }
}
