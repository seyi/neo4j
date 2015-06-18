/*
 * Copyright (c) 2002-2015 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.kernel.api.exceptions.schema;

import org.neo4j.kernel.api.exceptions.KernelException;
import org.neo4j.kernel.api.exceptions.Status;

/**
 * Constraint validation is the process of finding applicable constraints and verifying that
 * that they are not being violated. There are two ways that validation can fail: either the
 * {@linkplain ConstraintViolationKernelException data violates the constraint}, or
 * {@linkplain UnableToValidateConstraintKernelException the database is unable to perform the validation} for some
 * internal reason.
 *
 * @see ConstraintVerificationFailedKernelException
 */
public abstract class ConstraintValidationKernelException extends KernelException
{
    protected ConstraintValidationKernelException( String message, Object... parameters )
    {
        super( Status.Schema.ConstraintViolation, message, parameters );
    }

    protected ConstraintValidationKernelException( Throwable cause, String message, Object... parameters )
    {
        super( Status.Schema.ConstraintViolation, cause, message, parameters );
    }
}