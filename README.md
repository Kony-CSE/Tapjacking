  # Tapjacking
  A Kony Sample app to demonstrate how to handle tapjacking security threat.

  This vulnerability was surfaced again in later versions of Android i.e., 6.0.1. So, the best way to mitigate this is to write the FFI     only.
 
  https://www.xda-developers.com/how-tapjacking-made-a-return-with-android-marshmallow-and-nobody-noticed/

  The best way to handle is FFI. The FFI integration is automated to handle the issue.
  All you need to do is the below steps.
  1) Copy the androidprecompile task and tapjackingdontdelete folder in the root folder of the project.

    i.e. Your workspace --> Your project 
  
  2) Once you do step 1 everything is taken care. 
  For your reference we have also provided a Kony project handling the Tapjacking.
