/**
 * Copyright (C) 2009-2016 DANS - Data Archiving and  Networked Services (info@dans.knaw.nl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.knaw.dans.common.dbflib;


/**
 * Thrown to indicate that the data provided cannot be written to the database. The data was
 * provided as a Java object of incompatible type (for instance a {@link Boolean} object to a DATE
 * type field) or the format of the data was wrong (for instance a {@link String} object to a NUMBER
 * type field, which is allowed, but the <code>String</code> contains <code>"1a"</code>, that is, it
 * is not a valid number.
 *
 * @author Jan van Mansum
 */
public class DataMismatchException
    extends DbfLibException
{
    private static final long serialVersionUID = 6304059179012791413L;

    DataMismatchException(final String message)
    {
        super(message);
    }
}
