package DebugExample.DebugExampleInfo.core.models;
import javax.inject.Inject;
import org.apache.sling.api.SlingHttpServletRequest;
import javax.annotation.PostConstruct;
//import org.apache.sling.models.annotations.injectorspecific.SlingObject;
import org.apache.sling.api.resource.Resource;
//import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.Default;
//SlingHttpServletRequest.class,
@Model(adaptables = Resource.class)
public class Info {


      private String message;

        /*@SlingObject
        private SlingHttpServletRequest request;*/

        @Inject  @Default(values="Swathi")
        private String firstName;
        
       /* @ValueMapValue(name = "title",via = "resource",injectionStrategy = InjectionStrategy.REQUIRED)
         private String firstName;*/

        
        @Inject @Default(values="GC")
        private String lastName;
        
        @Inject //@Via("resource")
        private String contactNo;
   
        @PostConstruct
        protected void init() {
         
        message = "Hello World\n";
               
        /*if (request != null) {
            this.message += "Request Path: "+request.getRequestPathInfo().getResourcePath()+"\n";
        }*/
 
        message += "First Name: "+ firstName +" \n";
        message += "Last Name: "+ lastName + "\n";
         
        //logger.info("inside post construct");
    }

         public String getFirstName() {
            return firstName;
        }

       
        public String getLastName() {
            return lastName;
       }

      public String getMessage() {
        return message;
    }
       public String getContactNo() {
            return contactNo;
       }
}