// WARNING, THIS FILE IS AUTOMATICALLY GENERATED
// DO NOT MODIFY !

package com.medvision360.medrecord.client.query;

import org.restlet.Client;
import org.restlet.data.Language;
import org.restlet.data.Preference;
import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

import com.medvision360.lib.client.ClientResourceBase;
import com.medvision360.lib.client.ClientResourceConfig;
import com.medvision360.lib.client.ErrorDocument;
import com.medvision360.lib.common.exceptions.AnnotatedResourceException;
import com.medvision360.lib.common.exceptions.ApiException;

/**
    @apipath /query/ehr

 */
public class QueryEHRResource extends ClientResourceBase
{
    /**
     * Constructor.
     *
     * <p>This constructor can be used to create a new client for this resource.</p>
     *
     * @param config_ Configuration object containing the location of the server
     *   this resource sends requests to.
     */
    public QueryEHRResource(
        final ClientResourceConfig config_
    )
    {
        super(config_, "/query/ehr");
    }

    /**
       Query EHR resources.

Retrieve a list of EHR IDs known to the server encapsulated in JSON, matching the constraints that are
expressed as query parameters. All the query parameter types are AND-ed together. This means that a query like
<code>archetype=openEHR-EHR-OBSERVATION.blood_pressure.v1&archetypeQ=DEMOGRAPHIC</code> is guaranteed to never
return any results. However, when repeating the same parameter type multiple times, those are OR-ed together.
That means a query like <code>archetypeQ=body_weight&archetypeQ=blood_pressure</code> returns all locatables
that are either body weights or blood pressures.

The query parameters are matched against the root locatable <em>or</em> any of its contents.
So if you have a COMPOSITION containing a blood_pressure OBSERVATION, then a query
<code>archetypeQ=blood_pressure</code> will return that entire COMPOSITION (including, perhaps,
other data besides the blood_pressure OBSERVATION). If this is not what you want,
you need to use an advanced query such as <code>/query/xquery</code> or <code>/query/xquery/locatable</code>.



       <p>
       Use the {@link #ehrQuery(QueryEHRResourceEhrQueryParams)}
       method to pass additional query arguments.</p>


       @apiqueryparam excludeDeleted Set to true to exclude EHRs that have been marked as deleted in the
returned list, to any other value to include them, or omit the parameter to have the implementation choose
(typically using its most efficient option).
@apiqueryparam excludeEmpty Set to true to exclude EHRs that contain no locatables.
[type=string,single,default=false]
@apiqueryparam systemID An OpenEHR HierObjectID value specifying a systemID to search. Specify multiple
times to search multiple systemIDs, or do not specify to search all systemIDs.
[type=string,default=906C3435-8A06-4688-A9D0-CD233C1B072F]
@apiqueryparam subject An OpenEHR UIDBasedID value specifying a subject constraint on the EHRStatus
associated with the EHR.
[type=string,single,default=0AC32288-684C-4D86-B7E6-6C21E18E4390]
@apiqueryparam createdBefore An ISO8601 DateTime value specifying a constraint on the maximum value of the
time the EHR was created.
[type=string,single,default=20140101T00:00:00Z]
@apiqueryparam createdAfter An ISO8601 DateTime value specifying a constraint on the minimum value of the
time the EHR was created.
[type=string,single,default=20130101T00:00:00Z]



     */
    public com.medvision360.medrecord.api.IDList ehrQuery(
    ) throws
        com.medvision360.medrecord.api.exceptions.InvalidSystemIDException,
        com.medvision360.medrecord.api.exceptions.InvalidSubjectIDException,
        com.medvision360.medrecord.api.exceptions.InvalidDateTimeException,
        com.medvision360.medrecord.api.exceptions.InvalidRangeException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      return ehrQuery(
        null
      );
    }

    /**
       Query EHR resources.

Retrieve a list of EHR IDs known to the server encapsulated in JSON, matching the constraints that are
expressed as query parameters. All the query parameter types are AND-ed together. This means that a query like
<code>archetype=openEHR-EHR-OBSERVATION.blood_pressure.v1&archetypeQ=DEMOGRAPHIC</code> is guaranteed to never
return any results. However, when repeating the same parameter type multiple times, those are OR-ed together.
That means a query like <code>archetypeQ=body_weight&archetypeQ=blood_pressure</code> returns all locatables
that are either body weights or blood pressures.

The query parameters are matched against the root locatable <em>or</em> any of its contents.
So if you have a COMPOSITION containing a blood_pressure OBSERVATION, then a query
<code>archetypeQ=blood_pressure</code> will return that entire COMPOSITION (including, perhaps,
other data besides the blood_pressure OBSERVATION). If this is not what you want,
you need to use an advanced query such as <code>/query/xquery</code> or <code>/query/xquery/locatable</code>.



       @param queryParams_ The query parameters to be added to the request.

       @apiqueryparam excludeDeleted Set to true to exclude EHRs that have been marked as deleted in the
returned list, to any other value to include them, or omit the parameter to have the implementation choose
(typically using its most efficient option).
@apiqueryparam excludeEmpty Set to true to exclude EHRs that contain no locatables.
[type=string,single,default=false]
@apiqueryparam systemID An OpenEHR HierObjectID value specifying a systemID to search. Specify multiple
times to search multiple systemIDs, or do not specify to search all systemIDs.
[type=string,default=906C3435-8A06-4688-A9D0-CD233C1B072F]
@apiqueryparam subject An OpenEHR UIDBasedID value specifying a subject constraint on the EHRStatus
associated with the EHR.
[type=string,single,default=0AC32288-684C-4D86-B7E6-6C21E18E4390]
@apiqueryparam createdBefore An ISO8601 DateTime value specifying a constraint on the maximum value of the
time the EHR was created.
[type=string,single,default=20140101T00:00:00Z]
@apiqueryparam createdAfter An ISO8601 DateTime value specifying a constraint on the minimum value of the
time the EHR was created.
[type=string,single,default=20130101T00:00:00Z]


     */
    public com.medvision360.medrecord.api.IDList ehrQuery(
        final QueryEHRResourceEhrQueryParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.InvalidSystemIDException,
        com.medvision360.medrecord.api.exceptions.InvalidSubjectIDException,
        com.medvision360.medrecord.api.exceptions.InvalidDateTimeException,
        com.medvision360.medrecord.api.exceptions.InvalidRangeException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
        final ClientResource resource_ = getClientResource();
        try
        {
            if (queryParams_ != null)
            {
                queryParams_.applyTo(resource_);
            }

            final com.medvision360.medrecord.api.query.QueryEHRResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.query.QueryEHRResource.class);
            final com.medvision360.medrecord.api.IDList result_ = wrapped_.ehrQuery(
            );

            handleCookies(resource_);

            return result_;
        }
        catch(final ResourceException e_)
        {
            final ErrorDocument errorDocument_ = ErrorDocument.getFrom(resource_);
            if (errorDocument_ != null)
            {
                switch(errorDocument_.getCode())
                {
                    case "INVALID_SYSTEM_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidSystemIDException(errorDocument_.getArguments());
                    case "INVALID_SUBJECT_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidSubjectIDException(errorDocument_.getArguments());
                    case "INVALID_DATE_TIME_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidDateTimeException(errorDocument_.getArguments());
                    case "INVALID_RANGE_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidRangeException(errorDocument_.getArguments());
                    case "RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.RecordException(errorDocument_.getArguments());
                    case "IO_RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.IORecordException(errorDocument_.getArguments());
                }
            }
            throw e_;
        }
    }

}
