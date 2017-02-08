package com.freeride.controller;

import com.freeride.model.Travel;
import com.freeride.model.User;
import com.freeride.model.Vehicle;
import com.freeride.service.JoinTravelService;
import com.freeride.service.TravelService;
import com.freeride.service.UserService;
import com.freeride.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

/**
 * Created by Chamath Abeysinghe on 2/4/2017.
 */

@RestController
@RequestMapping("/api")
public class RestApiController {

    @Autowired
    UserService userService;
    @Autowired
    VehicleService vehicleService;
    @Autowired
    TravelService travelService;
    @Autowired
    JoinTravelService joinTravelService;

    /**
     * for testing purposes only
     * @return
     */
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers(){
        List<User> users=userService.findAllUsers();
        if(users.isEmpty()){
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<User>>(users,HttpStatus.OK);
    }

    /**
     * registering a new user into a system
     * @param allRequestParams
     * @return
     */
    @RequestMapping(value = "/registerUser",method = RequestMethod.POST)
    public ResponseEntity<String> register(@RequestParam Map<String,String> allRequestParams){

        String name = allRequestParams.get("name");
        String nic= allRequestParams.get("nic");
        String telephone= allRequestParams.get("telephone");
        String email= allRequestParams.get("email");
        String gender= allRequestParams.get("gender");
        User user=new User();
        user.setName(name);
        user.setEmail(email);
        user.setGender(gender);
        user.setNic(nic);
        user.setEmail(email);
        user.setTelephone(telephone);
        user.setSecurityCode("9999999"); //this security code should be changed later

//        if(!validUser){
//            return errorMsg;
//        }

        /**
         * these code should be changed later
         * checking existing user should be done using NIC
         * Security code should be returned from this method.
         */
        if(!userService.isUserExist(user)){
            userService.saveUser(user);
            return new ResponseEntity<String>("Successfully logged in :"+user.getSecurityCode(),HttpStatus.OK);
        }
        else{

            return new ResponseEntity<String>("Successfully logged in : "+user.getSecurityCode(),HttpStatus.OK);
        }

    }

    @RequestMapping(value = "/registerVehicle",method = RequestMethod.POST)
    public ResponseEntity<String> registerVehicle(@RequestParam Map<String,String> allRequestParams){
        Vehicle v=new Vehicle();
        v.setColor(allRequestParams.get("color"));
        v.setNumber(allRequestParams.get("number"));
        v.setUserId(Long.parseLong(allRequestParams.get("userId")));
        v.setType(allRequestParams.get("type"));

        if(vehicleService.isVehicleExists(v)){
            return new ResponseEntity<String>("Vehicle already in the system",HttpStatus.OK);
        }
        else{
            vehicleService.saveVehicle(v);
            return  new ResponseEntity<String>("Success",HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/registerTravel",method = RequestMethod.POST)
    public ResponseEntity<String> registerTravel(@RequestParam Map<String,String> allRequestParams){
        Travel travel=new Travel();
        travel.setEndLocation(allRequestParams.get("endLocation"));
        travel.setFromLocation(allRequestParams.get("fromLocation"));
        travel.setRoute(allRequestParams.get("route"));
        travel.setStartTime(allRequestParams.get("startTime"));
        travel.setVehicleId(Long.parseLong(allRequestParams.get("vehicleId")));
        travel.setStatus("New Travel");
        travelService.saveTravel(travel);
        return  new ResponseEntity<String>("Success",HttpStatus.OK);
    }









}
