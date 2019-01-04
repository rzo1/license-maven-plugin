package org.codehaus.mojo.license.model;

/*
 * #%L
 * License Maven Plugin
 * %%
 * Copyright (C) 2018 Codehaus
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 *
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */

import org.apache.maven.model.License;

/**
 * The license subelement of {@link ProjectLicenseInfo}.
 *
 * @since 1.17
 */
public class ProjectLicense
{


    /**
     * The full legal name of the license.
     */
    private String name;

    /**
     * The official url for the license text.
     */
    private String url;

    /**
     *
     *
     *             The primary method by which this project may be
     * distributed.
     *             <dl>
     *               <dt>repo</dt>
     *               <dd>may be downloaded from the Maven
     * repository</dd>
     *               <dt>manual</dt>
     *               <dd>user must manually download and install
     * the dependency.</dd>
     *             </dl>
     *
     *
     */
    private String distribution;

    /**
     * Addendum information pertaining to this license.
     */
    private String comments;

    /**
     * A name of the license file (without path) downloaded from {@link #url}.
     */
    private String file;

    /**
     * The default constructor.
     */
    public ProjectLicense()
    {
    }

    /**
     * Equivalent to {@code new ProjectLicense( license.getName(), license.getUrl(), license.getDistribution(),
     * license.getComments(), null )}
     *
     * @param license the license to get name, URL, ditribution and comments from
     */
    public ProjectLicense( License license )
    {
        this( license.getName(), license.getUrl(), license.getDistribution(), license.getComments(), null );
    }

    /**
     * The full constructor.
     *
     * @param name a human readable license name
     * @param url a URL from where the license text can be downloaded
     * @param distribution see {@link #getDistribution()}
     * @param comments additional information related to this license
     * @param file file name without path
     */
    public ProjectLicense( String name, String url, String distribution, String comments, String file )
    {
        super();
        this.name = name;
        this.url = url;
        this.distribution = distribution;
        this.comments = comments;
        this.file = file;
    }

    /**
     * Get addendum information pertaining to this license.
     *
     * @return String
     */
    public String getComments()
    {
        return this.comments;
    }

    /**
     * Get the primary method by which this project may be
     * distributed.
     *             <dl>
     *               <dt>repo</dt>
     *               <dd>may be downloaded from the Maven
     * repository</dd>
     *               <dt>manual</dt>
     *               <dd>user must manually download and install
     * the dependency.</dd>
     *             </dl>
     *
     * @return String
     */
    public String getDistribution()
    {
        return this.distribution;
    }

    /**
     * Get the full legal name of the license.
     *
     * @return String
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Get the official url for the license text.
     *
     * @return String
     */
    public String getUrl()
    {
        return this.url;
    }

    /**
     * Returns the name of the license file (without path) downloaded from {@link #url}.
     *
     * @return a path or {@code null}
     */
    public String getFile()
    {
        return this.file;
    }

    /**
     * Set addendum information pertaining to this license.
     *
     * @param comments
     */
    public void setComments( String comments )
    {
        this.comments = comments;
    }

    /**
     * Set the primary method by which this project may be
     * distributed.
     *             <dl>
     *               <dt>repo</dt>
     *               <dd>may be downloaded from the Maven
     * repository</dd>
     *               <dt>manual</dt>
     *               <dd>user must manually download and install
     * the dependency.</dd>
     *             </dl>
     *
     * @param distribution
     */
    public void setDistribution( String distribution )
    {
        this.distribution = distribution;
    }

    /**
     * Set the full legal name of the license.
     *
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * Set the official url for the license text.
     *
     * @param url
     */
    public void setUrl( String url )
    {
        this.url = url;
    }

    /**
     * Set the name of the license file (without path) downloaded from {@link #url}.
     *
     * @param file the path to set
     */
    public void setFile( String file )
    {
        this.file = file;
    }

}
