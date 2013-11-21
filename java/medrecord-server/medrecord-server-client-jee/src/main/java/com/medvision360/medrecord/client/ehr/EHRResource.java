// WARNING, THIS FILE IS AUTOMATICALLY GENERATED
// DO NOT MODIFY !

package com.medvision360.medrecord.client.ehr;

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
    @apipath /ehr/{id}
 @apipathparam id An OpenEHR HierObjectID value identifying an EHR.
   [type=string,required,single,default=71350448-25BA-4395-B354-19B9CA9D5096]

 */
public class EHRResource extends ClientResourceBase
{
    /**
     * Constructor.
     *
     * <p>This constructor can be used to create a new client for this resource.</p>
     *
     * @param config_ Configuration object containing the location of the server
     *   this resource sends requests to.
     * @param id An OpenEHR HierObjectID value identifying an EHR
     */
    public EHRResource(
        final ClientResourceConfig config_,
        final String id
    )
    {
        super(config_, "/ehr/" + id);
    }

    /**
       Retrieve EHR resource.

Retrieve basic info about an EHR as a JSON structure.



       <p>
       Use the {@link #getEHR(EHRResourceGetEHRParams)}
       method to pass additional query arguments.</p>


       @apiqueryparam ignoreDeleted Set to true to return the info even if the EHR has been marked as deleted.
[type=string,single,default=false]



     */
    public com.medvision360.medrecord.api.EHR getEHR(
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.InvalidEHRIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      return getEHR(
        null
      );
    }

    /**
       Retrieve EHR resource.

Retrieve basic info about an EHR as a JSON structure.



       @param queryParams_ The query parameters to be added to the request.

       @apiqueryparam ignoreDeleted Set to true to return the info even if the EHR has been marked as deleted.
[type=string,single,default=false]


     */
    public com.medvision360.medrecord.api.EHR getEHR(
        final EHRResourceGetEHRParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.ParseException,
        com.medvision360.medrecord.api.exceptions.InvalidEHRIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
        try
        {
            final ClientResource resource_ = getClientResource();
            if (queryParams_ != null)
            {
                queryParams_.applyTo(resource_);
            }

            final com.medvision360.medrecord.api.ehr.EHRResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.ehr.EHRResource.class);
            return wrapped_.getEHR(
            );
        }
        catch(final ResourceException e_)
        {
            final ErrorDocument errorDocument_ = getErrorDocument();
            if (errorDocument_ != null)
            {
                switch(errorDocument_.getCode())
                {
                    case "NOT_FOUND_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotFoundException(errorDocument_.getArguments());
                    case "PARSE_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.ParseException(errorDocument_.getArguments());
                    case "INVALID_EHR_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidEHRIDException(errorDocument_.getArguments());
                    case "RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.RecordException(errorDocument_.getArguments());
                    case "IO_RECORD_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.IORecordException(errorDocument_.getArguments());
                }
            }
            throw e_;
        }
    }

    /**
       Soft-delete EHR resource.

Delete a stored EHR. Fully deleting the entire EHR record is not possible. Rather, when deleting an EHR,
it is simply marked as deleted. This also does not delete the contents of an EHR. In OpenEHR,
actually deleting information in bulk is quite uncommon and it is not currently supported through this API.

The main reason to do actual erasure is in response to some kind of data protection request,
and such purge actions should not be taken lightly. To erase all information for a particular subject from the
server:
<ul>
<li>fetch their EHR record and mark it as deleted</li>
<li>iterate over all the locatables in their record and delete those</li>
<li>delete the EHRStatus associated with the EHR record</li>
<li>delete the Directory associated with the EHR record, if any</li>
<li>query for all demographic locatables of or about the subject and delete those</li>
</ul>

This will leave behind only an anonymous, flagged-as-deleted EHR record, which can be used by the system to
determine "there was information here but it has been erased".

Built-in API support for such a purge operation may be provided in the future.



       <p>
       Use the {@link #deleteEHR(EHRResourceDeleteEHRParams)}
       method to pass additional query arguments.</p>


       

     */
    public void deleteEHR(
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.InvalidLocatableIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
      deleteEHR(
        null
      );
    }

    /**
       Soft-delete EHR resource.

Delete a stored EHR. Fully deleting the entire EHR record is not possible. Rather, when deleting an EHR,
it is simply marked as deleted. This also does not delete the contents of an EHR. In OpenEHR,
actually deleting information in bulk is quite uncommon and it is not currently supported through this API.

The main reason to do actual erasure is in response to some kind of data protection request,
and such purge actions should not be taken lightly. To erase all information for a particular subject from the
server:
<ul>
<li>fetch their EHR record and mark it as deleted</li>
<li>iterate over all the locatables in their record and delete those</li>
<li>delete the EHRStatus associated with the EHR record</li>
<li>delete the Directory associated with the EHR record, if any</li>
<li>query for all demographic locatables of or about the subject and delete those</li>
</ul>

This will leave behind only an anonymous, flagged-as-deleted EHR record, which can be used by the system to
determine "there was information here but it has been erased".

Built-in API support for such a purge operation may be provided in the future.



       @param queryParams_ The query parameters to be added to the request.

       
     */
    public void deleteEHR(
        final EHRResourceDeleteEHRParams queryParams_
    ) throws
        com.medvision360.medrecord.api.exceptions.NotFoundException,
        com.medvision360.medrecord.api.exceptions.InvalidLocatableIDException,
        com.medvision360.medrecord.api.exceptions.RecordException,
        com.medvision360.medrecord.api.exceptions.IORecordException
    {
        try
        {
            final ClientResource resource_ = getClientResource();
            if (queryParams_ != null)
            {
                queryParams_.applyTo(resource_);
            }

            final com.medvision360.medrecord.api.ehr.EHRResource wrapped_ = resource_.wrap(com.medvision360.medrecord.api.ehr.EHRResource.class);
            wrapped_.deleteEHR(
            );
        }
        catch(final ResourceException e_)
        {
            final ErrorDocument errorDocument_ = getErrorDocument();
            if (errorDocument_ != null)
            {
                switch(errorDocument_.getCode())
                {
                    case "NOT_FOUND_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.NotFoundException(errorDocument_.getArguments());
                    case "INVALID_LOCATABLE_ID_EXCEPTION":
                        throw new com.medvision360.medrecord.api.exceptions.InvalidLocatableIDException(errorDocument_.getArguments());
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
