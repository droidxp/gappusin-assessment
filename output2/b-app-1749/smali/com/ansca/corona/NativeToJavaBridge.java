public class com.ansca.corona.NativeToJavaBridge {
	 /* .source "NativeToJavaBridge.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;, */
	 /* Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult; */
	 /* } */
} // .end annotation
/* # instance fields */
private com.ansca.corona.CoronaActivity myActivity;
private Integer myLastBitmapHeight;
private Float myLastBitmapScaleFactor;
private Integer myLastBitmapWidth;
/* # direct methods */
 com.ansca.corona.NativeToJavaBridge ( ) {
	 /* .locals 1 */
	 /* .param p1, "activity" # Lcom/ansca/corona/CoronaActivity; */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 258 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 259 */
	 this.myActivity = p1;
	 /* .line 260 */
	 /* iput v0, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapWidth:I */
	 /* .line 261 */
	 /* iput v0, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapHeight:I */
	 /* .line 262 */
	 /* const/high16 v0, 0x3f800000 # 1.0f */
	 /* iput v0, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapScaleFactor:F */
	 /* .line 263 */
	 return;
} // .end method
protected static void callCancelNativeAlert ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "which" # I */
	 /* .prologue */
	 /* .line 1316 */
	 com.ansca.corona.Controller .getController ( );
	 (( com.ansca.corona.Controller ) v0 ).cancelNativeAlert ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->cancelNativeAlert(I)V
	 /* .line 1317 */
	 return;
} // .end method
protected static void callCancelTimer ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1206 */
	 com.ansca.corona.Controller .getController ( );
	 (( com.ansca.corona.Controller ) v0 ).cancelTimer ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->cancelTimer()V
	 /* .line 1207 */
	 return;
} // .end method
protected static void callCloseNativeActivityIndicator ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1331 */
	 com.ansca.corona.Controller .getController ( );
	 (( com.ansca.corona.Controller ) v0 ).closeNativeActivityIndicator ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->closeNativeActivityIndicator()V
	 /* .line 1332 */
	 return;
} // .end method
protected static callCryptoCalculateDigest ( java.lang.String p0, Object[] p1 ) {
	 /* .locals 1 */
	 /* .param p0, "algorithm" # Ljava/lang/String; */
	 /* .param p1, "data" # [B */
	 /* .prologue */
	 /* .line 1677 */
	 com.ansca.corona.Crypto .CalculateDigest ( p0,p1 );
} // .end method
protected static callCryptoCalculateHMAC ( java.lang.String p0, java.lang.String p1, Object[] p2 ) {
	 /* .locals 1 */
	 /* .param p0, "algorithm" # Ljava/lang/String; */
	 /* .param p1, "key" # Ljava/lang/String; */
	 /* .param p2, "data" # [B */
	 /* .prologue */
	 /* .line 1681 */
	 com.ansca.corona.Crypto .CalculateHMAC ( p0,p1,p2 );
} // .end method
protected static Integer callCryptoGetDigestLength ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "algorithm" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 1673 */
	 v0 = 	 com.ansca.corona.Crypto .GetDigestLength ( p0 );
} // .end method
protected static Integer callDisplayObjectGetAlpha ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "id" # I */
	 /* .prologue */
	 /* .line 1603 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
protected static Boolean callDisplayObjectGetBackground ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "id" # I */
	 /* .prologue */
	 /* .line 1608 */
	 com.ansca.corona.ViewManager .getViewManager ( );
	 v0 = 	 (( com.ansca.corona.ViewManager ) v0 ).getDisplayObjectBackground ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->getDisplayObjectBackground(I)Z
} // .end method
protected static Boolean callDisplayObjectGetVisible ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "id" # I */
	 /* .prologue */
	 /* .line 1598 */
	 com.ansca.corona.ViewManager .getViewManager ( );
	 v0 = 	 (( com.ansca.corona.ViewManager ) v0 ).getDisplayObjectVisible ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->getDisplayObjectVisible(I)Z
} // .end method
protected static void callDisplayObjectSetAlpha ( Integer p0, Integer p1 ) {
	 /* .locals 0 */
	 /* .param p0, "id" # I */
	 /* .param p1, "alpha" # I */
	 /* .prologue */
	 /* .line 1589 */
	 return;
} // .end method
protected static void callDisplayObjectSetBackground ( Integer p0, Boolean p1 ) {
	 /* .locals 1 */
	 /* .param p0, "id" # I */
	 /* .param p1, "bg" # Z */
	 /* .prologue */
	 /* .line 1593 */
	 com.ansca.corona.ViewManager .getViewManager ( );
	 (( com.ansca.corona.ViewManager ) v0 ).setDisplayObjectBackground ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->setDisplayObjectBackground(IZ)V
	 /* .line 1594 */
	 return;
} // .end method
protected static void callDisplayObjectSetFocus ( Integer p0, Boolean p1 ) {
	 /* .locals 1 */
	 /* .param p0, "id" # I */
	 /* .param p1, "focus" # Z */
	 /* .prologue */
	 /* .line 1613 */
	 com.ansca.corona.ViewManager .getViewManager ( );
	 (( com.ansca.corona.ViewManager ) v0 ).setTextViewFocus ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->setTextViewFocus(IZ)V
	 /* .line 1614 */
	 return;
} // .end method
protected static void callDisplayObjectSetVisible ( Integer p0, Boolean p1 ) {
	 /* .locals 1 */
	 /* .param p0, "id" # I */
	 /* .param p1, "visible" # Z */
	 /* .prologue */
	 /* .line 1579 */
	 com.ansca.corona.ViewManager .getViewManager ( );
	 (( com.ansca.corona.ViewManager ) v0 ).setDisplayObjectVisible ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->setDisplayObjectVisible(IZ)V
	 /* .line 1580 */
	 return;
} // .end method
protected static void callDisplayObjectUpdateScreenBounds ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
	 /* .locals 6 */
	 /* .param p0, "id" # I */
	 /* .param p1, "x" # I */
	 /* .param p2, "y" # I */
	 /* .param p3, "w" # I */
	 /* .param p4, "h" # I */
	 /* .prologue */
	 /* .line 1584 */
	 com.ansca.corona.ViewManager .getViewManager ( );
	 /* move v1, p0 */
	 /* move v2, p1 */
	 /* move v3, p2 */
	 /* move v4, p3 */
	 /* move v5, p4 */
	 /* invoke-virtual/range {v0 ..v5}, Lcom/ansca/corona/ViewManager;->displayObjectUpdateScreenBounds(IIIII)V */
	 /* .line 1585 */
	 return;
} // .end method
protected static void callDisplayUpdate ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1356 */
	 com.ansca.corona.Controller .getController ( );
	 (( com.ansca.corona.Controller ) v0 ).displayUpdate ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->displayUpdate()V
	 /* .line 1357 */
	 return;
} // .end method
protected static java.lang.String callExternalizeResource ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "assetName" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 504 */
	 com.ansca.corona.NativeToJavaBridge .getBridge ( );
	 /* invoke-direct {v0, p0}, Lcom/ansca/corona/NativeToJavaBridge;->externalizeAsset(Ljava/lang/String;)Ljava/lang/String; */
} // .end method
protected static void callFBConnectLogin ( Integer p0, java.lang.String p1, java.lang.String[] p2 ) {
	 /* .locals 1 */
	 /* .param p0, "id" # I */
	 /* .param p1, "appId" # Ljava/lang/String; */
	 /* .param p2, "permissions" # [Ljava/lang/String; */
	 /* .prologue */
	 /* .line 1554 */
	 /* if-nez p2, :cond_0 */
	 /* .line 1556 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-array p2, v0, [Ljava/lang/String; */
	 /* .line 1559 */
} // :cond_0
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).facebookLogin ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/ansca/corona/Controller;->facebookLogin(Ljava/lang/String;[Ljava/lang/String;)V
/* .line 1560 */
return;
} // .end method
protected static void callFBConnectLogout ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1564 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).facebookLogout ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->facebookLogout()V
/* .line 1565 */
return;
} // .end method
protected static void callFBConnectRequest ( Integer p0, java.lang.String p1, java.lang.String p2, java.util.HashMap p3 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "path" # Ljava/lang/String; */
/* .param p2, "method" # Ljava/lang/String; */
/* .param p3, "params" # Ljava/util/HashMap; */
/* .prologue */
/* .line 1569 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).facebookRequest ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/ansca/corona/Controller;->facebookRequest(Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V
/* .line 1570 */
return;
} // .end method
protected static void callFBShowDialog ( Integer p0, java.lang.String p1, java.util.HashMap p2 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "action" # Ljava/lang/String; */
/* .param p2, "params" # Ljava/util/HashMap; */
/* .prologue */
/* .line 1574 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).facebookDialog ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/ansca/corona/Controller;->facebookDialog(Ljava/lang/String;Ljava/util/HashMap;)V
/* .line 1575 */
return;
} // .end method
protected static void callFlurryEvent ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "eventId" # Ljava/lang/String; */
/* .prologue */
/* .line 1696 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).flurryEvent ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->flurryEvent(Ljava/lang/String;)V
/* .line 1697 */
return;
} // .end method
protected static void callFlurryInit ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "applicationId" # Ljava/lang/String; */
/* .prologue */
/* .line 1691 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).flurryInit ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->flurryInit(Ljava/lang/String;)V
/* .line 1692 */
return;
} // .end method
protected static java.lang.String callGetAvailableStoreNames ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1824 */
com.ansca.corona.purchasing.StoreServices .getAvailableStoreNames ( );
} // .end method
protected static callGetBitmapAsset ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "assetName" # Ljava/lang/String; */
/* .prologue */
/* .line 1028 */
com.ansca.corona.NativeToJavaBridge .getBridge ( );
/* invoke-direct {v0, p0}, Lcom/ansca/corona/NativeToJavaBridge;->getBitmapAsset(Ljava/lang/String;)[I */
} // .end method
protected static callGetBitmapMaskAsset ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "assetName" # Ljava/lang/String; */
/* .prologue */
/* .line 1040 */
com.ansca.corona.NativeToJavaBridge .getBridge ( );
/* invoke-direct {v0, p0}, Lcom/ansca/corona/NativeToJavaBridge;->getBitmapMaskAsset(Ljava/lang/String;)[B */
} // .end method
protected static callGetBytesFromFile ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "filePathName" # Ljava/lang/String; */
/* .prologue */
/* .line 432 */
com.ansca.corona.NativeToJavaBridge .getBridge ( );
(( com.ansca.corona.NativeToJavaBridge ) v0 ).getBytesFromFile ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/NativeToJavaBridge;->getBytesFromFile(Ljava/lang/String;)[B
} // .end method
protected static java.lang.String callGetFonts ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1157 */
com.ansca.corona.CoronaText .getFonts ( );
} // .end method
protected static Boolean callGetIdleTimer ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1261 */
com.ansca.corona.Controller .getController ( );
v0 = (( com.ansca.corona.Controller ) v0 ).getIdleTimer ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->getIdleTimer()Z
} // .end method
protected static Integer callGetLastGraphicHeight ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1177 */
com.ansca.corona.NativeToJavaBridge .getBridge ( );
/* iget v0, v0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapHeight:I */
} // .end method
protected static Float callGetLastGraphicScaleFactor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1188 */
com.ansca.corona.NativeToJavaBridge .getBridge ( );
/* iget v0, v0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapScaleFactor:F */
} // .end method
protected static Integer callGetLastGraphicWidth ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1167 */
com.ansca.corona.NativeToJavaBridge .getBridge ( );
/* iget v0, v0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapWidth:I */
} // .end method
protected static java.lang.String callGetManufacturerName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1386 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).getManufacturerName ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->getManufacturerName()Ljava/lang/String;
} // .end method
protected static java.lang.String callGetModel ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1391 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).getModel ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->getModel()Ljava/lang/String;
} // .end method
protected static java.lang.String callGetName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1396 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).getName ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->getName()Ljava/lang/String;
} // .end method
protected static java.lang.String callGetPlatformVersion ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1406 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).getPlatformVersion ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->getPlatformVersion()Ljava/lang/String;
} // .end method
protected static java.lang.String callGetPreference ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "category" # I */
/* .prologue */
/* .line 1416 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).getPreference ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->getPreference(I)Ljava/lang/String;
} // .end method
protected static java.lang.String callGetProductName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1411 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).getProductName ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->getProductName()Ljava/lang/String;
} // .end method
protected static Boolean callGetRawAssetExists ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "assetName" # Ljava/lang/String; */
/* .prologue */
/* .line 376 */
com.ansca.corona.NativeToJavaBridge .getBridge ( );
v0 = /* invoke-direct {v0, p0}, Lcom/ansca/corona/NativeToJavaBridge;->getRawAssetExists(Ljava/lang/String;)Z */
} // .end method
protected static Integer callGetStatusBarHeight ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1296 */
int v1 = 0; // const/4 v1, 0x0
/* .line 1298 */
/* .local v1, "height":I */
com.ansca.corona.NativeToJavaBridge .getBridge ( );
/* monitor-enter v3 */
/* .line 1299 */
try { // :try_start_0
	 v2 = 	 com.ansca.corona.Controller .isValid ( );
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* .line 1300 */
		 com.ansca.corona.Controller .getActivity ( );
		 /* .line 1301 */
		 /* .local v0, "activity":Lcom/ansca/corona/CoronaActivity; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 1302 */
			 v1 = 			 (( com.ansca.corona.CoronaActivity ) v0 ).getStatusBarHeight ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getStatusBarHeight()I
			 /* .line 1305 */
		 } // .end local v0 # "activity":Lcom/ansca/corona/CoronaActivity;
	 } // :cond_0
	 /* monitor-exit v3 */
	 /* .line 1306 */
	 /* .line 1305 */
	 /* :catchall_0 */
	 /* move-exception v2 */
	 /* monitor-exit v3 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v2 */
} // .end method
protected static Integer callGetStatusBarMode ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 1282 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 1284 */
	 /* .local v1, "mode":I */
	 com.ansca.corona.NativeToJavaBridge .getBridge ( );
	 /* monitor-enter v3 */
	 /* .line 1285 */
	 try { // :try_start_0
		 v2 = 		 com.ansca.corona.Controller .isValid ( );
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 1286 */
			 com.ansca.corona.Controller .getActivity ( );
			 /* .line 1287 */
			 /* .local v0, "activity":Lcom/ansca/corona/CoronaActivity; */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 1288 */
				 v1 = 				 (( com.ansca.corona.CoronaActivity ) v0 ).getStatusBarMode ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getStatusBarMode()I
				 /* .line 1291 */
			 } // .end local v0 # "activity":Lcom/ansca/corona/CoronaActivity;
		 } // :cond_0
		 /* monitor-exit v3 */
		 /* .line 1292 */
		 /* .line 1291 */
		 /* :catchall_0 */
		 /* move-exception v2 */
		 /* monitor-exit v3 */
		 /* :try_end_0 */
		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 /* throw v2 */
	 } // .end method
	 protected static callGetText ( java.lang.String p0, java.lang.String p1, Float p2, Integer p3, Integer p4 ) {
		 /* .locals 8 */
		 /* .param p0, "text" # Ljava/lang/String; */
		 /* .param p1, "fontName" # Ljava/lang/String; */
		 /* .param p2, "fontSize" # F */
		 /* .param p3, "width" # I */
		 /* .param p4, "height" # I */
		 /* .prologue */
		 /* .line 1134 */
		 com.ansca.corona.NativeToJavaBridge .getBridge ( );
		 /* .line 1136 */
		 /* .local v6, "bridge":Lcom/ansca/corona/NativeToJavaBridge; */
		 (( com.ansca.corona.NativeToJavaBridge ) v6 ).getActivity ( ); // invoke-virtual {v6}, Lcom/ansca/corona/NativeToJavaBridge;->getActivity()Lcom/ansca/corona/CoronaActivity;
		 com.ansca.corona.CoronaText .getCoronaText ( p1,p2,v1 );
		 /* .line 1138 */
		 /* .local v0, "theText":Lcom/ansca/corona/CoronaText; */
		 (( com.ansca.corona.NativeToJavaBridge ) v6 ).getActivity ( ); // invoke-virtual {v6}, Lcom/ansca/corona/NativeToJavaBridge;->getActivity()Lcom/ansca/corona/CoronaActivity;
		 /* move-object v1, p0 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* invoke-virtual/range {v0 ..v5}, Lcom/ansca/corona/CoronaText;->render(Ljava/lang/String;FIILcom/ansca/corona/CoronaActivity;)V */
		 /* .line 1139 */
		 v1 = 		 (( com.ansca.corona.CoronaText ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaText;->getWidth()I
		 /* iput v1, v6, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapWidth:I */
		 /* .line 1140 */
		 v1 = 		 (( com.ansca.corona.CoronaText ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaText;->getHeight()I
		 /* iput v1, v6, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapHeight:I */
		 /* .line 1141 */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* iput v1, v6, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapScaleFactor:F */
		 /* .line 1143 */
		 (( com.ansca.corona.CoronaText ) v0 ).getBits ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaText;->getBits()[B
		 /* .line 1145 */
		 /* .local v7, "result":[B */
		 (( com.ansca.corona.CoronaText ) v0 ).release ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaText;->release()V
		 /* .line 1147 */
	 } // .end method
	 protected static java.lang.String callGetUniqueIdentifier ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "identifierType" # I */
		 /* .prologue */
		 /* .line 1401 */
		 com.ansca.corona.Controller .getController ( );
		 (( com.ansca.corona.Controller ) v0 ).getUniqueIdentifier ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->getUniqueIdentifier(I)Ljava/lang/String;
	 } // .end method
	 protected static Float callGetVolume ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "id" # I */
		 /* .prologue */
		 /* .line 1436 */
		 com.ansca.corona.Controller .getMediaManager ( );
		 v0 = 		 (( com.ansca.corona.MediaManager ) v0 ).getVolume ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/MediaManager;->getVolume(I)F
	 } // .end method
	 protected static Boolean callHasAccelerometer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1371 */
		 com.ansca.corona.Controller .getController ( );
		 v0 = 		 (( com.ansca.corona.Controller ) v0 ).hasAccelerometer ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->hasAccelerometer()Z
	 } // .end method
	 protected static Boolean callHasGyroscope ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1376 */
		 com.ansca.corona.Controller .getController ( );
		 v0 = 		 (( com.ansca.corona.Controller ) v0 ).hasGyroscope ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->hasGyroscope()Z
	 } // .end method
	 protected static Boolean callHasMediaSource ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "mediaSourceType" # I */
		 /* .prologue */
		 /* .line 1336 */
		 com.ansca.corona.Controller .getController ( );
		 v0 = 		 (( com.ansca.corona.Controller ) v0 ).hasMediaSource ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->hasMediaSource(I)Z
	 } // .end method
	 protected static void callHttpPost ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
		 /* .locals 1 */
		 /* .param p0, "url" # Ljava/lang/String; */
		 /* .param p1, "key" # Ljava/lang/String; */
		 /* .param p2, "value" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1241 */
		 com.ansca.corona.Controller .getController ( );
		 (( com.ansca.corona.Controller ) v0 ).httpPost ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/ansca/corona/Controller;->httpPost(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 1242 */
		 return;
	 } // .end method
	 protected static void callInMobiHide ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1739 */
		 com.ansca.corona.Controller .getController ( );
		 com.ansca.corona.Controller .getAdManager ( );
		 (( com.ansca.corona.AdManager ) v0 ).hideInMobiAd ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AdManager;->hideInMobiAd()V
		 /* .line 1740 */
		 return;
	 } // .end method
	 protected static void callInMobiInit ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "applicationId" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1729 */
		 com.ansca.corona.Controller .getController ( );
		 com.ansca.corona.Controller .getAdManager ( );
		 /* .line 1730 */
		 /* .local v0, "manager":Lcom/ansca/corona/AdManager; */
		 (( com.ansca.corona.AdManager ) v0 ).hideInMobiAd ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AdManager;->hideInMobiAd()V
		 /* .line 1731 */
		 (( com.ansca.corona.AdManager ) v0 ).setInMobiApplicationId ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/AdManager;->setInMobiApplicationId(Ljava/lang/String;)V
		 /* .line 1732 */
		 return;
	 } // .end method
	 protected static void callInMobiShow ( java.lang.String p0, Float p1, Float p2, Double p3, Boolean p4 ) {
		 /* .locals 7 */
		 /* .param p0, "bannerTypeName" # Ljava/lang/String; */
		 /* .param p1, "x" # F */
		 /* .param p2, "y" # F */
		 /* .param p3, "intervalInSeconds" # D */
		 /* .param p5, "testModeEnabled" # Z */
		 /* .prologue */
		 /* .line 1735 */
		 com.ansca.corona.Controller .getController ( );
		 com.ansca.corona.Controller .getAdManager ( );
		 /* move-object v1, p0 */
		 /* move v2, p1 */
		 /* move v3, p2 */
		 /* move-wide v4, p3 */
		 /* move v6, p5 */
		 /* invoke-virtual/range {v0 ..v6}, Lcom/ansca/corona/AdManager;->showInMobiAd(Ljava/lang/String;FFDZ)V */
		 /* .line 1736 */
		 return;
	 } // .end method
	 protected static void callInneractiveHide ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1753 */
		 com.ansca.corona.Controller .getController ( );
		 com.ansca.corona.Controller .getAdManager ( );
		 (( com.ansca.corona.AdManager ) v0 ).hideInneractiveAd ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AdManager;->hideInneractiveAd()V
		 /* .line 1754 */
		 return;
	 } // .end method
	 protected static void callInneractiveInit ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "applicationId" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1743 */
		 com.ansca.corona.Controller .getController ( );
		 com.ansca.corona.Controller .getAdManager ( );
		 /* .line 1744 */
		 /* .local v0, "manager":Lcom/ansca/corona/AdManager; */
		 (( com.ansca.corona.AdManager ) v0 ).hideInneractiveAd ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AdManager;->hideInneractiveAd()V
		 /* .line 1745 */
		 (( com.ansca.corona.AdManager ) v0 ).setInneractiveApplicationId ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/AdManager;->setInneractiveApplicationId(Ljava/lang/String;)V
		 /* .line 1746 */
		 return;
	 } // .end method
	 protected static void callInneractiveShow ( java.lang.String p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 1 */
		 /* .param p0, "adTypeName" # Ljava/lang/String; */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .param p3, "intervalInSeconds" # I */
		 /* .prologue */
		 /* .line 1749 */
		 com.ansca.corona.Controller .getController ( );
		 com.ansca.corona.Controller .getAdManager ( );
		 (( com.ansca.corona.AdManager ) v0 ).showInneractiveAd ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/ansca/corona/AdManager;->showInneractiveAd(Ljava/lang/String;III)V
		 /* .line 1750 */
		 return;
	 } // .end method
	 protected static Integer callInvokeLuaErrorHandler ( Long p0 ) {
		 /* .locals 1 */
		 /* .param p0, "luaStateMemoryAddress" # J */
		 /* .prologue */
		 /* .line 345 */
		 v0 = 		 com.ansca.corona.CoronaEnvironment .invokeLuaErrorHandler ( p0,p1 );
	 } // .end method
	 protected static void callLoadEventSound ( Integer p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p0, "id" # I */
		 /* .param p1, "soundName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1216 */
		 com.ansca.corona.Controller .getEventManager ( );
		 (( com.ansca.corona.events.EventManager ) v0 ).loadEventSound ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/events/EventManager;->loadEventSound(ILjava/lang/String;)V
		 /* .line 1217 */
		 return;
	 } // .end method
	 protected static void callLoadSound ( Integer p0, java.lang.String p1 ) {
		 /* .locals 1 */
		 /* .param p0, "id" # I */
		 /* .param p1, "soundName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1211 */
		 com.ansca.corona.Controller .getEventManager ( );
		 (( com.ansca.corona.events.EventManager ) v0 ).loadSound ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/events/EventManager;->loadSound(ILjava/lang/String;)V
		 /* .line 1212 */
		 return;
	 } // .end method
	 protected static void callNetworkRequest ( java.lang.String p0, java.lang.String p1, Integer p2, java.util.HashMap p3, java.lang.String p4, java.lang.String p5 ) {
		 /* .locals 7 */
		 /* .param p0, "url" # Ljava/lang/String; */
		 /* .param p1, "method" # Ljava/lang/String; */
		 /* .param p2, "listenerId" # I */
		 /* .param p3, "params" # Ljava/util/HashMap; */
		 /* .param p4, "body" # Ljava/lang/String; */
		 /* .param p5, "path" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1685 */
		 com.ansca.corona.NativeToJavaBridge .getBridge ( );
		 /* .local v0, "bridge":Lcom/ansca/corona/NativeToJavaBridge; */
		 /* move-object v1, p0 */
		 /* move-object v2, p1 */
		 /* move v3, p2 */
		 /* move-object v4, p3 */
		 /* move-object v5, p4 */
		 /* move-object v6, p5 */
		 /* .line 1686 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/ansca/corona/NativeToJavaBridge;->networkRequest(Ljava/lang/String;Ljava/lang/String;ILjava/util/HashMap;Ljava/lang/String;Ljava/lang/String;)V */
		 /* .line 1687 */
		 return;
	 } // .end method
	 protected static void callOnRuntimeExiting ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 337 */
		 com.ansca.corona.Controller .getRuntime ( );
		 /* .line 338 */
		 /* .local v0, "runtime":Lcom/ansca/corona/CoronaRuntime; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 339 */
			 (( com.ansca.corona.CoronaRuntime ) v0 ).dispose ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRuntime;->dispose()V
			 /* .line 341 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected static void callOnRuntimeLoaded ( Long p0 ) {
		 /* .locals 1 */
		 /* .param p0, "luaStateMemoryAddress" # J */
		 /* .prologue */
		 /* .line 305 */
		 com.ansca.corona.Controller .getRuntime ( );
		 /* .line 306 */
		 /* .local v0, "runtime":Lcom/ansca/corona/CoronaRuntime; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 307 */
			 (( com.ansca.corona.CoronaRuntime ) v0 ).onLoaded ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/CoronaRuntime;->onLoaded(J)V
			 /* .line 309 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected static void callOnRuntimeResumed ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 329 */
		 com.ansca.corona.Controller .getRuntime ( );
		 /* .line 330 */
		 /* .local v0, "runtime":Lcom/ansca/corona/CoronaRuntime; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 331 */
			 (( com.ansca.corona.CoronaRuntime ) v0 ).onResumed ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRuntime;->onResumed()V
			 /* .line 333 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected static void callOnRuntimeStarted ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 313 */
		 com.ansca.corona.Controller .getRuntime ( );
		 /* .line 314 */
		 /* .local v0, "runtime":Lcom/ansca/corona/CoronaRuntime; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 315 */
			 (( com.ansca.corona.CoronaRuntime ) v0 ).onStarted ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRuntime;->onStarted()V
			 /* .line 317 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected static void callOnRuntimeSuspended ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 321 */
		 com.ansca.corona.Controller .getRuntime ( );
		 /* .line 322 */
		 /* .local v0, "runtime":Lcom/ansca/corona/CoronaRuntime; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 323 */
			 (( com.ansca.corona.CoronaRuntime ) v0 ).onSuspended ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaRuntime;->onSuspended()V
			 /* .line 325 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected static void callOpenFeintInit ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3 ) {
		 /* .locals 1 */
		 /* .param p0, "appName" # Ljava/lang/String; */
		 /* .param p1, "appKey" # Ljava/lang/String; */
		 /* .param p2, "appSecret" # Ljava/lang/String; */
		 /* .param p3, "appId" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1701 */
		 com.ansca.corona.Controller .getController ( );
		 (( com.ansca.corona.Controller ) v0 ).openFeintInit ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/ansca/corona/Controller;->openFeintInit(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 1702 */
		 return;
	 } // .end method
	 protected static void callOpenFeintLaunchDashboard ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "dashboard" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1705 */
		 com.ansca.corona.Controller .getController ( );
		 (( com.ansca.corona.Controller ) v0 ).openFeintLaunchDashboard ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->openFeintLaunchDashboard(Ljava/lang/String;)V
		 /* .line 1706 */
		 return;
	 } // .end method
	 protected static void callOpenFeintSetHighScore ( java.lang.String p0, Integer p1, java.lang.String p2 ) {
		 /* .locals 3 */
		 /* .param p0, "leaderboardId" # Ljava/lang/String; */
		 /* .param p1, "score" # I */
		 /* .param p2, "displayText" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1713 */
		 com.ansca.corona.Controller .getController ( );
		 /* int-to-long v1, p1 */
		 (( com.ansca.corona.Controller ) v0 ).openFeintSetHighScore ( p0, v1, v2, p2 ); // invoke-virtual {v0, p0, v1, v2, p2}, Lcom/ansca/corona/Controller;->openFeintSetHighScore(Ljava/lang/String;JLjava/lang/String;)V
		 /* .line 1714 */
		 return;
	 } // .end method
	 protected static void callOpenFeintUnlockAchievement ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "achievementId" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1709 */
		 com.ansca.corona.Controller .getController ( );
		 (( com.ansca.corona.Controller ) v0 ).openFeintUnlockAchievement ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->openFeintUnlockAchievement(Ljava/lang/String;)V
		 /* .line 1710 */
		 return;
	 } // .end method
	 protected static void callOpenUrl ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "url" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 1251 */
		 com.ansca.corona.Controller .getController ( );
		 (( com.ansca.corona.Controller ) v0 ).openUrl ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->openUrl(Ljava/lang/String;)V
		 /* .line 1252 */
		 return;
	 } // .end method
	 protected static void callPauseSound ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "id" # I */
		 /* .prologue */
		 /* .line 1231 */
		 com.ansca.corona.Controller .getEventManager ( );
		 (( com.ansca.corona.events.EventManager ) v0 ).pauseSound ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/events/EventManager;->pauseSound(I)V
		 /* .line 1232 */
		 return;
	 } // .end method
	 protected static void callPlaySound ( Integer p0, java.lang.String p1, Boolean p2 ) {
		 /* .locals 1 */
		 /* .param p0, "id" # I */
		 /* .param p1, "soundName" # Ljava/lang/String; */
		 /* .param p2, "loop" # Z */
		 /* .prologue */
		 /* .line 1221 */
		 com.ansca.corona.Controller .getEventManager ( );
		 (( com.ansca.corona.events.EventManager ) v0 ).playSound ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/ansca/corona/events/EventManager;->playSound(ILjava/lang/String;Z)V
		 /* .line 1222 */
		 return;
	 } // .end method
	 protected static void callPlayVideo ( Integer p0, java.lang.String p1, Boolean p2 ) {
		 /* .locals 1 */
		 /* .param p0, "id" # I */
		 /* .param p1, "url" # Ljava/lang/String; */
		 /* .param p2, "mediaControlsEnabled" # Z */
		 /* .prologue */
		 /* .line 1246 */
		 com.ansca.corona.Controller .getMediaManager ( );
		 (( com.ansca.corona.MediaManager ) v0 ).playVideo ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/ansca/corona/MediaManager;->playVideo(ILjava/lang/String;Z)V
		 /* .line 1247 */
		 return;
	 } // .end method
	 protected static java.nio.ByteBuffer callRecordGetBytes ( Integer p0 ) {
		 /* .locals 3 */
		 /* .param p0, "id" # I */
		 /* .prologue */
		 /* .line 1628 */
		 com.ansca.corona.Controller .getMediaManager ( );
		 (( com.ansca.corona.MediaManager ) v2 ).getAudioRecorder ( p0 ); // invoke-virtual {v2, p0}, Lcom/ansca/corona/MediaManager;->getAudioRecorder(I)Lcom/ansca/corona/AudioRecorder;
		 (( com.ansca.corona.AudioRecorder ) v2 ).getNextBuffer ( ); // invoke-virtual {v2}, Lcom/ansca/corona/AudioRecorder;->getNextBuffer()Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;
		 /* .line 1629 */
		 /* .local v0, "buffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 1630 */
			 v1 = this.myBuffer;
			 /* .line 1634 */
		 } // :goto_0
	 } // :cond_0
	 int v1 = 0; // const/4 v1, 0x0
} // .end method
protected static Integer callRecordGetCurrentByteCount ( Integer p0 ) {
	 /* .locals 2 */
	 /* .param p0, "id" # I */
	 /* .prologue */
	 /* .line 1639 */
	 com.ansca.corona.Controller .getMediaManager ( );
	 (( com.ansca.corona.MediaManager ) v1 ).getAudioRecorder ( p0 ); // invoke-virtual {v1, p0}, Lcom/ansca/corona/MediaManager;->getAudioRecorder(I)Lcom/ansca/corona/AudioRecorder;
	 (( com.ansca.corona.AudioRecorder ) v1 ).getCurrentBuffer ( ); // invoke-virtual {v1}, Lcom/ansca/corona/AudioRecorder;->getCurrentBuffer()Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;
	 /* .line 1640 */
	 /* .local v0, "buffer":Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 1641 */
		 /* iget v1, v0, Lcom/ansca/corona/AudioRecorder$AudioByteBufferHolder;->myValidBytes:I */
		 /* .line 1642 */
	 } // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
protected static void callRecordReleaseCurrentBuffer ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1647 */
com.ansca.corona.Controller .getMediaManager ( );
(( com.ansca.corona.MediaManager ) v0 ).getAudioRecorder ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/MediaManager;->getAudioRecorder(I)Lcom/ansca/corona/AudioRecorder;
(( com.ansca.corona.AudioRecorder ) v0 ).releaseCurrentBuffer ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AudioRecorder;->releaseCurrentBuffer()V
/* .line 1648 */
return;
} // .end method
protected static void callRecordStart ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "file" # Ljava/lang/String; */
/* .param p1, "id" # I */
/* .prologue */
/* .line 1618 */
com.ansca.corona.Controller .getMediaManager ( );
(( com.ansca.corona.MediaManager ) v0 ).getAudioRecorder ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/MediaManager;->getAudioRecorder(I)Lcom/ansca/corona/AudioRecorder;
(( com.ansca.corona.AudioRecorder ) v0 ).startRecording ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/AudioRecorder;->startRecording(Ljava/lang/String;)V
/* .line 1619 */
return;
} // .end method
protected static void callRecordStop ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1623 */
com.ansca.corona.Controller .getMediaManager ( );
(( com.ansca.corona.MediaManager ) v0 ).getAudioRecorder ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/MediaManager;->getAudioRecorder(I)Lcom/ansca/corona/AudioRecorder;
(( com.ansca.corona.AudioRecorder ) v0 ).stopRecording ( ); // invoke-virtual {v0}, Lcom/ansca/corona/AudioRecorder;->stopRecording()V
/* .line 1624 */
return;
} // .end method
protected static void callRequestExitApplication ( ) {
/* .locals 2 */
/* .prologue */
/* .line 273 */
v0 = com.ansca.corona.Controller .isValid ( );
/* if-nez v0, :cond_0 */
/* .line 288 */
} // :goto_0
return;
/* .line 278 */
} // :cond_0
com.ansca.corona.Controller .getActivity ( );
/* new-instance v1, Lcom/ansca/corona/NativeToJavaBridge$1; */
/* invoke-direct {v1}, Lcom/ansca/corona/NativeToJavaBridge$1;-><init>()V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
} // .end method
protected static void callResumeSound ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1236 */
com.ansca.corona.Controller .getEventManager ( );
(( com.ansca.corona.events.EventManager ) v0 ).resumeSound ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/events/EventManager;->resumeSound(I)V
/* .line 1237 */
return;
} // .end method
protected static Boolean callSaveBitmap ( Integer[] p0, Integer p1, Integer p2, Integer p3, java.lang.String p4 ) {
/* .locals 17 */
/* .param p0, "pixels" # [I */
/* .param p1, "width" # I */
/* .param p2, "height" # I */
/* .param p3, "quality" # I */
/* .param p4, "filePathName" # Ljava/lang/String; */
/* .prologue */
/* .line 1051 */
v15 = com.ansca.corona.Controller .isValid ( );
/* if-nez v15, :cond_0 */
/* .line 1052 */
final String v15 = "Corona"; // const-string v15, "Corona"
final String v16 = "callSaveBitmap has invalid controller"; // const-string v16, "callSaveBitmap has invalid controller"
/* invoke-static/range {v15 ..v16}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 1053 */
int v14 = 0; // const/4 v14, 0x0
/* .line 1119 */
} // :goto_0
/* .line 1057 */
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
/* .line 1058 */
/* .local v3, "addToPhotoLibrary":Z */
if ( p4 != null) { // if-eqz p4, :cond_1
v15 = /* invoke-virtual/range {p4 ..p4}, Ljava/lang/String;->length()I */
/* if-gtz v15, :cond_7 */
/* .line 1061 */
} // :cond_1
try { // :try_start_0
v15 = android.os.Environment.DIRECTORY_PICTURES;
android.os.Environment .getExternalStoragePublicDirectory ( v15 );
/* .line 1062 */
/* .local v8, "directory":Ljava/io/File; */
v15 = (( java.io.File ) v8 ).exists ( ); // invoke-virtual {v8}, Ljava/io/File;->exists()Z
/* if-nez v15, :cond_2 */
/* .line 1063 */
v7 = (( java.io.File ) v8 ).mkdirs ( ); // invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z
/* .line 1065 */
/* .local v7, "didCreate":Z */
/* if-nez v7, :cond_2 */
/* .line 1068 */
/* new-instance v8, Ljava/io/File; */
} // .end local v8 # "directory":Ljava/io/File;
final String v15 = "/mnt/media/My Files"; // const-string v15, "/mnt/media/My Files"
/* invoke-direct {v8, v15}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 1069 */
/* .restart local v8 # "directory":Ljava/io/File; */
v15 = (( java.io.File ) v8 ).exists ( ); // invoke-virtual {v8}, Ljava/io/File;->exists()Z
/* if-nez v15, :cond_2 */
/* .line 1070 */
final String v15 = "Corona"; // const-string v15, "Corona"
final String v16 = "ERROR: Failed to save bitmap.Could not access valid directory for saving bitmap"; // const-string v16, "ERROR: Failed to save bitmap.Could not access valid directory for saving bitmap"
/* invoke-static/range {v15 ..v16}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 1071 */
int v14 = 0; // const/4 v14, 0x0
/* .line 1076 */
} // .end local v7 # "didCreate":Z
} // :cond_2
/* const/16 p4, 0x0 */
/* .line 1077 */
com.ansca.corona.Controller .getActivity ( );
(( com.ansca.corona.CoronaActivity ) v15 ).getApplicationInfo ( ); // invoke-virtual {v15}, Lcom/ansca/corona/CoronaActivity;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* .line 1078 */
/* .local v4, "applicationInfo":Landroid/content/pm/ApplicationInfo; */
com.ansca.corona.Controller .getActivity ( );
(( com.ansca.corona.CoronaActivity ) v15 ).getPackageManager ( ); // invoke-virtual {v15}, Lcom/ansca/corona/CoronaActivity;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.pm.PackageManager ) v15 ).getApplicationLabel ( v4 ); // invoke-virtual {v15, v4}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
/* check-cast v5, Ljava/lang/String; */
/* .line 1079 */
/* .local v5, "applicationName":Ljava/lang/String; */
if ( v5 != null) { // if-eqz v5, :cond_3
v15 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* if-gtz v15, :cond_4 */
/* .line 1080 */
} // :cond_3
final String v5 = "Corona"; // const-string v5, "Corona"
/* .line 1082 */
} // :cond_4
int v12 = 1; // const/4 v12, 0x1
/* .local v12, "index":I */
} // :goto_1
/* const/16 v15, 0x2710 */
/* if-gt v12, v15, :cond_5 */
/* .line 1083 */
/* new-instance v11, Ljava/io/File; */
/* new-instance v15, Ljava/lang/StringBuilder; */
/* invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v15 ).append ( v5 ); // invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v16 = " Picture "; // const-string v16, " Picture "
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
java.lang.Integer .toString ( v12 );
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
final String v16 = ".png"; // const-string v16, ".png"
/* invoke-virtual/range {v15 ..v16}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
(( java.lang.StringBuilder ) v15 ).toString ( ); // invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v11, v8, v15}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 1084 */
/* .local v11, "imageFile":Ljava/io/File; */
v15 = (( java.io.File ) v11 ).exists ( ); // invoke-virtual {v11}, Ljava/io/File;->exists()Z
/* if-nez v15, :cond_6 */
/* .line 1085 */
(( java.io.File ) v11 ).getAbsolutePath ( ); // invoke-virtual {v11}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 1086 */
int v3 = 1; // const/4 v3, 0x1
/* .line 1090 */
} // .end local v11 # "imageFile":Ljava/io/File;
} // :cond_5
/* if-nez p4, :cond_7 */
/* .line 1091 */
final String v15 = "Corona"; // const-string v15, "Corona"
final String v16 = "Failed to generate a unique image file name for the photo library."; // const-string v16, "Failed to generate a unique image file name for the photo library."
/* invoke-static/range {v15 ..v16}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1092 */
int v14 = 0; // const/4 v14, 0x0
/* goto/16 :goto_0 */
/* .line 1082 */
/* .restart local v11 # "imageFile":Ljava/io/File; */
} // :cond_6
/* add-int/lit8 v12, v12, 0x1 */
/* .line 1095 */
} // .end local v4 # "applicationInfo":Landroid/content/pm/ApplicationInfo;
} // .end local v5 # "applicationName":Ljava/lang/String;
} // .end local v8 # "directory":Ljava/io/File;
} // .end local v11 # "imageFile":Ljava/io/File;
} // .end local v12 # "index":I
/* :catch_0 */
/* move-exception v10 */
/* .line 1096 */
/* .local v10, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v10 ).printStackTrace ( ); // invoke-virtual {v10}, Ljava/lang/Exception;->printStackTrace()V
/* .line 1097 */
int v14 = 0; // const/4 v14, 0x0
/* goto/16 :goto_0 */
/* .line 1104 */
} // .end local v10 # "ex":Ljava/lang/Exception;
} // :cond_7
try { // :try_start_1
/* move-object/from16 v0, p0 */
/* array-length v13, v0 */
/* .line 1105 */
/* .local v13, "length":I */
v15 = android.graphics.Bitmap$Config.ARGB_8888;
/* move-object/from16 v0, p0 */
/* move/from16 v1, p1 */
/* move/from16 v2, p2 */
android.graphics.Bitmap .createBitmap ( v0,v1,v2,v15 );
/* :try_end_1 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 1114 */
/* .local v6, "bitmap":Landroid/graphics/Bitmap; */
com.ansca.corona.Controller .getController ( );
/* move/from16 v0, p3 */
/* move-object/from16 v1, p4 */
v14 = (( com.ansca.corona.Controller ) v15 ).saveBitmap ( v6, v0, v1 ); // invoke-virtual {v15, v6, v0, v1}, Lcom/ansca/corona/Controller;->saveBitmap(Landroid/graphics/Bitmap;ILjava/lang/String;)Z
/* .line 1115 */
/* .local v14, "wasSaved":Z */
if ( v14 != null) { // if-eqz v14, :cond_8
if ( v3 != null) { // if-eqz v3, :cond_8
/* .line 1116 */
com.ansca.corona.Controller .getController ( );
/* move-object/from16 v0, p4 */
(( com.ansca.corona.Controller ) v15 ).addImageFileToPhotoGallery ( v0 ); // invoke-virtual {v15, v0}, Lcom/ansca/corona/Controller;->addImageFileToPhotoGallery(Ljava/lang/String;)V
/* .line 1118 */
} // :cond_8
(( android.graphics.Bitmap ) v6 ).recycle ( ); // invoke-virtual {v6}, Landroid/graphics/Bitmap;->recycle()V
/* goto/16 :goto_0 */
/* .line 1107 */
} // .end local v6 # "bitmap":Landroid/graphics/Bitmap;
} // .end local v13 # "length":I
} // .end local v14 # "wasSaved":Z
/* :catch_1 */
/* move-exception v9 */
/* .line 1108 */
/* .local v9, "e":Ljava/lang/IllegalArgumentException; */
v15 = java.lang.System.out;
(( java.lang.IllegalArgumentException ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/IllegalArgumentException;->toString()Ljava/lang/String;
/* invoke-virtual/range {v15 ..v16}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V */
/* .line 1109 */
int v14 = 0; // const/4 v14, 0x0
/* goto/16 :goto_0 */
} // .end method
protected static void callSetAccelerometerInterval ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "frequencyInHz" # I */
/* .prologue */
/* .line 1361 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).setAccelerometerInterval ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->setAccelerometerInterval(I)V
/* .line 1362 */
return;
} // .end method
protected static void callSetEventNotification ( Integer p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "eventType" # I */
/* .param p1, "enable" # Z */
/* .prologue */
/* .line 1381 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).setEventNotification ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/Controller;->setEventNotification(IZ)V
/* .line 1382 */
return;
} // .end method
protected static void callSetGyroscopeInterval ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "frequencyInHz" # I */
/* .prologue */
/* .line 1366 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).setGyroscopeInterval ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->setGyroscopeInterval(I)V
/* .line 1367 */
return;
} // .end method
protected static void callSetIdleTimer ( Boolean p0 ) {
/* .locals 1 */
/* .param p0, "enabled" # Z */
/* .prologue */
/* .line 1256 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).setIdleTimer ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->setIdleTimer(Z)V
/* .line 1257 */
return;
} // .end method
protected static void callSetLocationAccuracy ( Double p0 ) {
/* .locals 0 */
/* .param p0, "meters" # D */
/* .prologue */
/* .line 1427 */
return;
} // .end method
protected static void callSetLocationThreshold ( Double p0 ) {
/* .locals 1 */
/* .param p0, "meters" # D */
/* .prologue */
/* .line 1431 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).setLocationThreshold ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/Controller;->setLocationThreshold(D)V
/* .line 1432 */
return;
} // .end method
protected static void callSetStatusBarMode ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "mode" # I */
/* .prologue */
/* .line 1266 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1267 */
com.ansca.corona.Controller .getActivity ( );
/* new-instance v1, Lcom/ansca/corona/NativeToJavaBridge$2; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/NativeToJavaBridge$2;-><init>(I)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1278 */
} // :cond_0
return;
} // .end method
protected static void callSetTimer ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "milliseconds" # I */
/* .prologue */
/* .line 1198 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).setTimer ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->setTimer(I)V
/* .line 1199 */
return;
} // .end method
protected static void callSetVolume ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "v" # F */
/* .prologue */
/* .line 1441 */
com.ansca.corona.Controller .getMediaManager ( );
(( com.ansca.corona.MediaManager ) v0 ).setVolume ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/MediaManager;->setVolume(IF)V
/* .line 1442 */
return;
} // .end method
protected static void callShowImagePicker ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "imageSourceType" # I */
/* .param p1, "destinationFilePath" # Ljava/lang/String; */
/* .prologue */
/* .line 1341 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).showImagePickerWindow ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/Controller;->showImagePickerWindow(ILjava/lang/String;)V
/* .line 1342 */
return;
} // .end method
protected static void callShowNativeActivityIndicator ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1326 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).showNativeActivityIndicator ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->showNativeActivityIndicator()V
/* .line 1327 */
return;
} // .end method
protected static void callShowNativeAlert ( java.lang.String p0, java.lang.String p1, java.lang.String[] p2 ) {
/* .locals 1 */
/* .param p0, "title" # Ljava/lang/String; */
/* .param p1, "msg" # Ljava/lang/String; */
/* .param p2, "buttonLabels" # [Ljava/lang/String; */
/* .prologue */
/* .line 1311 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).showNativeAlert ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/ansca/corona/Controller;->showNativeAlert(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/* .line 1312 */
return;
} // .end method
protected static void callShowSendMailPopup ( java.util.HashMap p0 ) {
/* .locals 1 */
/* .param p0, "dictionaryOfSettings" # Ljava/util/HashMap; */
/* .prologue */
/* .line 1346 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).showSendMailWindow ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->showSendMailWindow(Ljava/util/HashMap;)V
/* .line 1347 */
return;
} // .end method
protected static void callShowSendSmsPopup ( java.util.HashMap p0 ) {
/* .locals 1 */
/* .param p0, "dictionaryOfSettings" # Ljava/util/HashMap; */
/* .prologue */
/* .line 1351 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).showSendSmsWindow ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/Controller;->showSendSmsWindow(Ljava/util/HashMap;)V
/* .line 1352 */
return;
} // .end method
protected static void callShowTrialAlert ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1321 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).showTrialAlert ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->showTrialAlert()V
/* .line 1322 */
return;
} // .end method
protected static void callStopSound ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1226 */
com.ansca.corona.Controller .getEventManager ( );
(( com.ansca.corona.events.EventManager ) v0 ).stopSound ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/events/EventManager;->stopSound(I)V
/* .line 1227 */
return;
} // .end method
protected static void callStoreFinishTransaction ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "transactionStringId" # Ljava/lang/String; */
/* .prologue */
/* .line 1794 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1795 */
com.ansca.corona.Controller .getActivity ( );
/* new-instance v1, Lcom/ansca/corona/NativeToJavaBridge$5; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/NativeToJavaBridge$5;-><init>(Ljava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1806 */
} // :cond_0
return;
} // .end method
protected static void callStoreInit ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "storeName" # Ljava/lang/String; */
/* .prologue */
/* .line 1757 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1758 */
com.ansca.corona.Controller .getActivity ( );
/* new-instance v1, Lcom/ansca/corona/NativeToJavaBridge$3; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/NativeToJavaBridge$3;-><init>(Ljava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1776 */
} // :cond_0
return;
} // .end method
protected static void callStorePurchase ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "productName" # Ljava/lang/String; */
/* .prologue */
/* .line 1779 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1780 */
com.ansca.corona.Controller .getActivity ( );
/* new-instance v1, Lcom/ansca/corona/NativeToJavaBridge$4; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/NativeToJavaBridge$4;-><init>(Ljava/lang/String;)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1791 */
} // :cond_0
return;
} // .end method
protected static void callStoreRestoreCompletedTransactions ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1809 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1810 */
com.ansca.corona.Controller .getActivity ( );
/* new-instance v1, Lcom/ansca/corona/NativeToJavaBridge$6; */
/* invoke-direct {v1}, Lcom/ansca/corona/NativeToJavaBridge$6;-><init>()V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1821 */
} // :cond_0
return;
} // .end method
protected static void callSuperRewardsInit ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "appId" # Ljava/lang/String; */
/* .param p1, "uid" # Ljava/lang/String; */
/* .prologue */
/* .line 1717 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).superRewardsInit ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/Controller;->superRewardsInit(Ljava/lang/String;Ljava/lang/String;)V
/* .line 1718 */
return;
} // .end method
protected static void callSuperRewardsRequestUpdate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1725 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).superRewardsRequestUpdate ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->superRewardsRequestUpdate()V
/* .line 1726 */
return;
} // .end method
protected static void callSuperRewardsShowOffers ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1721 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).superRewardsShowOffers ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->superRewardsShowOffers()V
/* .line 1722 */
return;
} // .end method
protected static Integer callTextFieldCreate ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Boolean p5 ) {
/* .locals 7 */
/* .param p0, "id" # I */
/* .param p1, "left" # I */
/* .param p2, "top" # I */
/* .param p3, "width" # I */
/* .param p4, "height" # I */
/* .param p5, "isSingleLine" # Z */
/* .prologue */
/* .line 1446 */
com.ansca.corona.ViewManager .getViewManager ( );
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-virtual/range {v0 ..v6}, Lcom/ansca/corona/ViewManager;->addTextView(IIIIIZ)V */
/* .line 1448 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
protected static void callTextFieldDestroy ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1453 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).destroyTextView ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->destroyTextView(I)V
/* .line 1454 */
return;
} // .end method
protected static java.lang.String callTextFieldGetAlign ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1529 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).getTextViewAlign ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->getTextViewAlign(I)Ljava/lang/String;
} // .end method
protected static callTextFieldGetColor ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1500 */
com.ansca.corona.ViewManager .getViewManager ( );
v0 = (( com.ansca.corona.ViewManager ) v2 ).getTextViewColor ( p0 ); // invoke-virtual {v2, p0}, Lcom/ansca/corona/ViewManager;->getTextViewColor(I)I
/* .line 1502 */
/* .local v0, "argb":I */
int v2 = 4; // const/4 v2, 0x4
/* new-array v1, v2, [I */
/* .line 1504 */
/* .local v1, "result":[I */
int v2 = 0; // const/4 v2, 0x0
v3 = android.graphics.Color .red ( v0 );
/* aput v3, v1, v2 */
/* .line 1505 */
int v2 = 1; // const/4 v2, 0x1
v3 = android.graphics.Color .green ( v0 );
/* aput v3, v1, v2 */
/* .line 1506 */
int v2 = 2; // const/4 v2, 0x2
v3 = android.graphics.Color .blue ( v0 );
/* aput v3, v1, v2 */
/* .line 1507 */
int v2 = 3; // const/4 v2, 0x3
v3 = android.graphics.Color .alpha ( v0 );
/* aput v3, v1, v2 */
/* .line 1509 */
} // .end method
protected static java.lang.String callTextFieldGetFont ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1524 */
final String v0 = ""; // const-string v0, ""
} // .end method
protected static java.lang.String callTextFieldGetInputType ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1539 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).getTextViewInputType ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->getTextViewInputType(I)Ljava/lang/String;
} // .end method
protected static Boolean callTextFieldGetSecure ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1534 */
com.ansca.corona.ViewManager .getViewManager ( );
v0 = (( com.ansca.corona.ViewManager ) v0 ).getTextViewPassword ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->getTextViewPassword(I)Z
} // .end method
protected static Float callTextFieldGetSize ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1519 */
com.ansca.corona.ViewManager .getViewManager ( );
v0 = (( com.ansca.corona.ViewManager ) v0 ).getTextViewSize ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->getTextViewSize(I)F
} // .end method
protected static java.lang.String callTextFieldGetText ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1514 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).getTextViewText ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->getTextViewText(I)Ljava/lang/String;
} // .end method
protected static Boolean callTextFieldIsEditable ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1549 */
com.ansca.corona.ViewManager .getViewManager ( );
v0 = (( com.ansca.corona.ViewManager ) v0 ).isTextViewEditable ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->isTextViewEditable(I)Z
} // .end method
protected static Boolean callTextFieldIsSingleLine ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1544 */
com.ansca.corona.ViewManager .getViewManager ( );
v0 = (( com.ansca.corona.ViewManager ) v0 ).isTextViewSingleLine ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->isTextViewSingleLine(I)Z
} // .end method
protected static void callTextFieldSetAlign ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "align" # Ljava/lang/String; */
/* .prologue */
/* .line 1480 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).setTextViewAlign ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->setTextViewAlign(ILjava/lang/String;)V
/* .line 1481 */
return;
} // .end method
protected static void callTextFieldSetColor ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4 ) {
/* .locals 2 */
/* .param p0, "id" # I */
/* .param p1, "r" # I */
/* .param p2, "g" # I */
/* .param p3, "b" # I */
/* .param p4, "a" # I */
/* .prologue */
/* .line 1458 */
v0 = android.graphics.Color .argb ( p4,p1,p2,p3 );
/* .line 1460 */
/* .local v0, "color":I */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v1 ).setTextViewColor ( p0, v0 ); // invoke-virtual {v1, p0, v0}, Lcom/ansca/corona/ViewManager;->setTextViewColor(II)V
/* .line 1461 */
return;
} // .end method
protected static void callTextFieldSetEditable ( Integer p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "isEditable" # Z */
/* .prologue */
/* .line 1495 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).setTextViewEditable ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->setTextViewEditable(IZ)V
/* .line 1496 */
return;
} // .end method
protected static void callTextFieldSetFont ( Integer p0, java.lang.String p1, Float p2 ) {
/* .locals 2 */
/* .param p0, "id" # I */
/* .param p1, "fontName" # Ljava/lang/String; */
/* .param p2, "fontSize" # F */
/* .prologue */
/* .line 1475 */
com.ansca.corona.ViewManager .getViewManager ( );
com.ansca.corona.NativeToJavaBridge .getBridge ( );
(( com.ansca.corona.NativeToJavaBridge ) v1 ).getActivity ( ); // invoke-virtual {v1}, Lcom/ansca/corona/NativeToJavaBridge;->getActivity()Lcom/ansca/corona/CoronaActivity;
(( com.ansca.corona.ViewManager ) v0 ).setTextViewFont ( p0, p1, p2, v1 ); // invoke-virtual {v0, p0, p1, p2, v1}, Lcom/ansca/corona/ViewManager;->setTextViewFont(ILjava/lang/String;FLcom/ansca/corona/CoronaActivity;)V
/* .line 1476 */
return;
} // .end method
protected static void callTextFieldSetInputType ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "inputType" # Ljava/lang/String; */
/* .prologue */
/* .line 1490 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).setTextViewInputType ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->setTextViewInputType(ILjava/lang/String;)V
/* .line 1491 */
return;
} // .end method
protected static void callTextFieldSetSecure ( Integer p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "isSecure" # Z */
/* .prologue */
/* .line 1485 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).setTextViewPassword ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->setTextViewPassword(IZ)V
/* .line 1486 */
return;
} // .end method
protected static void callTextFieldSetSize ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "fontSize" # F */
/* .prologue */
/* .line 1470 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).setTextViewSize ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->setTextViewSize(IF)V
/* .line 1471 */
return;
} // .end method
protected static void callTextFieldSetText ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 1465 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).setTextViewText ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->setTextViewText(ILjava/lang/String;)V
/* .line 1466 */
return;
} // .end method
protected static void callVibrate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1421 */
com.ansca.corona.Controller .getController ( );
(( com.ansca.corona.Controller ) v0 ).vibrate ( ); // invoke-virtual {v0}, Lcom/ansca/corona/Controller;->vibrate()V
/* .line 1422 */
return;
} // .end method
protected static Boolean callWebViewClose ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1669 */
com.ansca.corona.ViewManager .getViewManager ( );
v0 = (( com.ansca.corona.ViewManager ) v0 ).closeWebView ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->closeWebView(I)Z
} // .end method
protected static Integer callWebViewCreate ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Boolean p5, Boolean p6 ) {
/* .locals 8 */
/* .param p0, "id" # I */
/* .param p1, "left" # I */
/* .param p2, "top" # I */
/* .param p3, "width" # I */
/* .param p4, "height" # I */
/* .param p5, "background" # Z */
/* .param p6, "autoCloseEnabled" # Z */
/* .prologue */
/* .line 1652 */
com.ansca.corona.ViewManager .getViewManager ( );
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* move v7, p6 */
/* invoke-virtual/range {v0 ..v7}, Lcom/ansca/corona/ViewManager;->addWebView(IIIIIZZ)V */
/* .line 1654 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
protected static void callWebViewDestroy ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 1659 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).destroyWebView ( p0 ); // invoke-virtual {v0, p0}, Lcom/ansca/corona/ViewManager;->destroyWebView(I)V
/* .line 1660 */
return;
} // .end method
protected static void callWebViewShow ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "id" # I */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 1664 */
com.ansca.corona.ViewManager .getViewManager ( );
(( com.ansca.corona.ViewManager ) v0 ).showWebView ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lcom/ansca/corona/ViewManager;->showWebView(ILjava/lang/String;)V
/* .line 1665 */
return;
} // .end method
private com.ansca.corona.NativeToJavaBridge$LoadBitmapResult createBitmap ( java.lang.String p0 ) {
/* .locals 30 */
/* .param p1, "assetName" # Ljava/lang/String; */
/* .prologue */
/* .line 648 */
/* const/16 v25, 0x0 */
/* .line 651 */
/* .local v25, "result":Landroid/graphics/Bitmap; */
/* invoke-direct/range {p0 ..p1}, Lcom/ansca/corona/NativeToJavaBridge;->getBitmapFileInfo(Ljava/lang/String;)Landroid/graphics/BitmapFactory$Options; */
/* .line 652 */
/* .local v21, "options":Landroid/graphics/BitmapFactory$Options; */
/* if-nez v21, :cond_0 */
/* .line 654 */
int v3 = 0; // const/4 v3, 0x0
/* .line 785 */
} // :goto_0
/* .line 659 */
} // :cond_0
/* const/16 v28, 0x0 */
/* .line 660 */
/* .local v28, "stream":Ljava/io/InputStream; */
v17 = /* invoke-direct/range {p0 ..p1}, Lcom/ansca/corona/NativeToJavaBridge;->isAssetFile(Ljava/lang/String;)Z */
/* .line 662 */
/* .local v17, "isAssetFile":Z */
if ( v17 != null) { // if-eqz v17, :cond_1
/* .line 663 */
try { // :try_start_0
/* move-object/from16 v0, p0 */
v3 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v3 ).getAssets ( ); // invoke-virtual {v3}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager;
/* .line 664 */
/* .local v10, "assetManager":Landroid/content/res/AssetManager; */
int v3 = 3; // const/4 v3, 0x3
/* move-object/from16 v0, p1 */
(( android.content.res.AssetManager ) v10 ).open ( v0, v3 ); // invoke-virtual {v10, v0, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* .line 673 */
} // .end local v10 # "assetManager":Landroid/content/res/AssetManager;
} // :goto_1
/* if-nez v28, :cond_2 */
/* .line 674 */
int v3 = 0; // const/4 v3, 0x0
/* .line 667 */
} // :cond_1
/* new-instance v29, Ljava/io/FileInputStream; */
/* move-object/from16 v0, v29 */
/* move-object/from16 v1, p1 */
/* invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // .end local v28 # "stream":Ljava/io/InputStream;
/* .local v29, "stream":Ljava/io/InputStream; */
/* move-object/from16 v28, v29 */
} // .end local v29 # "stream":Ljava/io/InputStream;
/* .restart local v28 # "stream":Ljava/io/InputStream; */
/* .line 670 */
/* :catch_0 */
/* move-exception v12 */
/* .line 671 */
/* .local v12, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v12 ).printStackTrace ( ); // invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V
/* .line 680 */
} // .end local v12 # "ex":Ljava/lang/Exception;
} // :cond_2
v3 = com.ansca.corona.JavaToNativeShim .getMaxTextureSize ( );
/* const/16 v4, 0x800 */
v9 = java.lang.Math .min ( v3,v4 );
/* .line 681 */
/* .local v9, "MAX_DIMENSION_IN_PIXELS":I */
/* move-object/from16 v0, v21 */
/* iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I */
/* move/from16 v23, v0 */
/* .line 682 */
/* .local v23, "originalWidth":I */
/* move-object/from16 v0, v21 */
/* iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I */
/* move/from16 v22, v0 */
/* .line 683 */
/* .local v22, "originalHeight":I */
/* move-object/from16 v0, v21 */
/* iget v3, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I */
/* move-object/from16 v0, v21 */
/* iget v4, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I */
v3 = java.lang.Math .max ( v3,v4 );
/* int-to-float v3, v3 */
/* int-to-float v4, v9 */
/* div-float v24, v3, v4 */
/* .line 684 */
/* .local v24, "percentLength":F */
/* new-instance v21, Landroid/graphics/BitmapFactory$Options; */
} // .end local v21 # "options":Landroid/graphics/BitmapFactory$Options;
/* invoke-direct/range {v21 ..v21}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
/* .line 685 */
/* .restart local v21 # "options":Landroid/graphics/BitmapFactory$Options; */
int v3 = 1; // const/4 v3, 0x1
/* move-object/from16 v0, v21 */
/* iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I */
} // :goto_2
/* const/high16 v3, 0x3f800000 # 1.0f */
/* cmpl-float v3, v24, v3 */
/* if-lez v3, :cond_3 */
/* .line 686 */
/* move-object/from16 v0, v21 */
/* iget v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* move-object/from16 v0, v21 */
/* iput v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I */
/* .line 687 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float v24, v24, v3 */
/* .line 689 */
} // :cond_3
/* move-object/from16 v0, v21 */
/* iget v3, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I */
int v4 = 1; // const/4 v4, 0x1
/* if-le v3, v4, :cond_4 */
/* .line 690 */
final String v3 = "Corona"; // const-string v3, "Corona"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "getBitmapAsset: Downsampling image file \'"; // const-string v5, "getBitmapAsset: Downsampling image file \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\' to fit max texture size of "; // const-string v5, "\' to fit max texture size of "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toString ( v9 );
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "."; // const-string v5, "."
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 697 */
} // :cond_4
/* mul-int v3, v23, v22 */
/* move-object/from16 v0, v21 */
/* iget v4, v0, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I */
/* div-int/2addr v3, v4 */
/* int-to-long v15, v3 */
/* .line 698 */
/* .local v15, "imagePixelCount":J */
/* const-wide/16 v3, 0x4 */
/* mul-long v19, v15, v3 */
/* .line 699 */
/* .local v19, "memoryUsage":J */
/* const-wide/16 v3, 0x2 */
/* mul-long v19, v19, v3 */
/* .line 700 */
/* const-wide/32 v3, 0x1e8480 */
/* add-long v19, v19, v3 */
/* .line 702 */
v3 = android.graphics.Bitmap$Config.ARGB_8888;
/* move-object/from16 v0, v21 */
this.inPreferredConfig = v3;
/* .line 703 */
java.lang.Runtime .getRuntime ( );
(( java.lang.Runtime ) v3 ).maxMemory ( ); // invoke-virtual {v3}, Ljava/lang/Runtime;->maxMemory()J
/* move-result-wide v3 */
/* cmp-long v3, v19, v3 */
/* if-lez v3, :cond_5 */
/* .line 704 */
final String v3 = "Corona"; // const-string v3, "Corona"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "getBitmapAsset: Not enough memory to load file \'"; // const-string v5, "getBitmapAsset: Not enough memory to load file \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\' as a 32-bit image.Reducing the image quality to 16-bit."; // const-string v5, "\' as a 32-bit image.Reducing the image quality to 16-bit."
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 706 */
v3 = android.graphics.Bitmap$Config.RGB_565;
/* move-object/from16 v0, v21 */
this.inPreferredConfig = v3;
/* .line 710 */
} // :cond_5
int v2 = 0; // const/4 v2, 0x0
/* .line 712 */
/* .local v2, "bitmap":Landroid/graphics/Bitmap; */
int v3 = 0; // const/4 v3, 0x0
try { // :try_start_1
/* move-object/from16 v0, v28 */
/* move-object/from16 v1, v21 */
android.graphics.BitmapFactory .decodeStream ( v0,v3,v1 );
/* :try_end_1 */
/* .catch Ljava/lang/OutOfMemoryError; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 735 */
} // :goto_3
try { // :try_start_2
/* invoke-virtual/range {v28 ..v28}, Ljava/io/InputStream;->close()V */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_4 */
/* .line 739 */
} // :goto_4
/* if-nez v2, :cond_7 */
/* .line 740 */
final String v3 = "Corona"; // const-string v3, "Corona"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "getBitmapAsset: Unable to decode file \'"; // const-string v5, "getBitmapAsset: Unable to decode file \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\'"; // const-string v5, "\'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 741 */
int v3 = 0; // const/4 v3, 0x0
/* goto/16 :goto_0 */
/* .line 714 */
/* :catch_1 */
/* move-exception v18 */
/* .line 718 */
/* .local v18, "memoryException":Ljava/lang/OutOfMemoryError; */
try { // :try_start_3
/* move-object/from16 v0, v21 */
v3 = this.inPreferredConfig;
v4 = android.graphics.Bitmap$Config.ARGB_8888;
/* if-ne v3, v4, :cond_6 */
/* .line 719 */
final String v3 = "Corona"; // const-string v3, "Corona"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "getBitmapAsset: Failed to load file \'"; // const-string v5, "getBitmapAsset: Failed to load file \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\' as a 32-bit image.Reducing the image quality to 16-bit."; // const-string v5, "\' as a 32-bit image.Reducing the image quality to 16-bit."
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 721 */
v3 = android.graphics.Bitmap$Config.RGB_565;
/* move-object/from16 v0, v21 */
this.inPreferredConfig = v3;
/* .line 722 */
int v3 = 0; // const/4 v3, 0x0
/* move-object/from16 v0, v28 */
/* move-object/from16 v1, v21 */
android.graphics.BitmapFactory .decodeStream ( v0,v3,v1 );
/* .line 725 */
} // :cond_6
/* throw v18 */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
/* .line 728 */
/* :catch_2 */
/* move-exception v12 */
/* .line 729 */
/* .restart local v12 # "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v12 ).printStackTrace ( ); // invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V
/* .line 732 */
} // .end local v12 # "ex":Ljava/lang/Exception;
} // .end local v18 # "memoryException":Ljava/lang/OutOfMemoryError;
/* :catch_3 */
/* move-exception v12 */
/* .line 733 */
/* .restart local v12 # "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v12 ).printStackTrace ( ); // invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V
/* .line 736 */
} // .end local v12 # "ex":Ljava/lang/Exception;
/* :catch_4 */
/* move-exception v12 */
/* .line 737 */
/* .restart local v12 # "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v12 ).printStackTrace ( ); // invoke-virtual {v12}, Ljava/lang/Exception;->printStackTrace()V
/* .line 745 */
} // .end local v12 # "ex":Ljava/lang/Exception;
} // :cond_7
/* const/high16 v11, 0x3f800000 # 1.0f */
/* .line 746 */
/* .local v11, "downsampleScale":F */
v3 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* move/from16 v0, v23 */
/* if-eq v3, v0, :cond_8 */
/* .line 747 */
v3 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v3, v3 */
/* move/from16 v0, v23 */
/* int-to-float v4, v0 */
/* div-float v11, v3, v4 */
/* .line 753 */
} // :cond_8
/* if-nez v17, :cond_9 */
/* .line 755 */
try { // :try_start_4
/* new-instance v14, Landroid/media/ExifInterface; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v14, v0}, Landroid/media/ExifInterface;-><init>(Ljava/lang/String;)V */
/* .line 756 */
/* .local v14, "exifReader":Landroid/media/ExifInterface; */
final String v3 = "Orientation"; // const-string v3, "Orientation"
int v4 = 1; // const/4 v4, 0x1
v13 = (( android.media.ExifInterface ) v14 ).getAttributeInt ( v3, v4 ); // invoke-virtual {v14, v3, v4}, Landroid/media/ExifInterface;->getAttributeInt(Ljava/lang/String;I)I
/* .line 758 */
/* .local v13, "exifOrientation":I */
/* const/16 v27, 0x0 */
/* .line 759 */
/* .local v27, "rotationInDegrees":I */
/* packed-switch v13, :pswitch_data_0 */
/* .line 770 */
} // :goto_5
/* :pswitch_0 */
/* if-lez v27, :cond_9 */
/* .line 771 */
/* new-instance v7, Landroid/graphics/Matrix; */
/* invoke-direct {v7}, Landroid/graphics/Matrix;-><init>()V */
/* .line 772 */
/* .local v7, "matrix":Landroid/graphics/Matrix; */
/* move/from16 v0, v27 */
/* int-to-float v3, v0 */
(( android.graphics.Matrix ) v7 ).postRotate ( v3 ); // invoke-virtual {v7, v3}, Landroid/graphics/Matrix;->postRotate(F)Z
/* .line 773 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
v5 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
v6 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
int v8 = 1; // const/4 v8, 0x1
/* invoke-static/range {v2 ..v8}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* .line 774 */
/* .local v26, "rotatedBitmap":Landroid/graphics/Bitmap; */
(( android.graphics.Bitmap ) v2 ).recycle ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->recycle()V
/* :try_end_4 */
/* .catch Ljava/lang/OutOfMemoryError; {:try_start_4 ..:try_end_4} :catch_5 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_6 */
/* .line 775 */
/* move-object/from16 v2, v26 */
/* .line 785 */
} // .end local v7 # "matrix":Landroid/graphics/Matrix;
} // .end local v13 # "exifOrientation":I
} // .end local v14 # "exifReader":Landroid/media/ExifInterface;
} // .end local v26 # "rotatedBitmap":Landroid/graphics/Bitmap;
} // .end local v27 # "rotationInDegrees":I
} // :cond_9
} // :goto_6
/* new-instance v3, Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult; */
/* move-object/from16 v0, p0 */
/* invoke-direct {v3, v0, v2, v11}, Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult;-><init>(Lcom/ansca/corona/NativeToJavaBridge;Landroid/graphics/Bitmap;F)V */
/* goto/16 :goto_0 */
/* .line 761 */
/* .restart local v13 # "exifOrientation":I */
/* .restart local v14 # "exifReader":Landroid/media/ExifInterface; */
/* .restart local v27 # "rotationInDegrees":I */
/* :pswitch_1 */
/* const/16 v27, 0x5a */
/* .line 762 */
/* .line 764 */
/* :pswitch_2 */
/* const/16 v27, 0xb4 */
/* .line 765 */
/* .line 767 */
/* :pswitch_3 */
/* const/16 v27, 0x10e */
/* .line 778 */
} // .end local v13 # "exifOrientation":I
} // .end local v14 # "exifReader":Landroid/media/ExifInterface;
} // .end local v27 # "rotationInDegrees":I
/* :catch_5 */
/* move-exception v12 */
/* .line 779 */
/* .local v12, "ex":Ljava/lang/OutOfMemoryError; */
final String v3 = "Corona"; // const-string v3, "Corona"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "getBitmapAsset: Not enough memory to rotate image \'"; // const-string v5, "getBitmapAsset: Not enough memory to rotate image \'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "\'"; // const-string v5, "\'"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v4 );
/* .line 781 */
} // .end local v12 # "ex":Ljava/lang/OutOfMemoryError;
/* :catch_6 */
/* move-exception v3 */
/* .line 759 */
/* :pswitch_data_0 */
/* .packed-switch 0x3 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
private static android.graphics.Bitmap createGrayscaleBitmap ( android.graphics.Bitmap p0 ) {
/* .locals 9 */
/* .param p0, "bitmap" # Landroid/graphics/Bitmap; */
/* .prologue */
int v8 = 0; // const/4 v8, 0x0
/* .line 509 */
v6 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 510 */
/* .local v6, "width":I */
v3 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 514 */
/* .local v3, "height":I */
v7 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v6,v3,v7 );
/* .line 515 */
/* .local v5, "result":Landroid/graphics/Bitmap; */
/* new-instance v0, Landroid/graphics/Canvas; */
/* invoke-direct {v0, v5}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 516 */
/* .local v0, "c":Landroid/graphics/Canvas; */
/* new-instance v1, Landroid/graphics/ColorMatrix; */
/* invoke-direct {v1}, Landroid/graphics/ColorMatrix;-><init>()V */
/* .line 517 */
/* .local v1, "cm":Landroid/graphics/ColorMatrix; */
(( android.graphics.ColorMatrix ) v1 ).setSaturation ( v8 ); // invoke-virtual {v1, v8}, Landroid/graphics/ColorMatrix;->setSaturation(F)V
/* .line 518 */
/* new-instance v2, Landroid/graphics/ColorMatrixColorFilter; */
/* invoke-direct {v2, v1}, Landroid/graphics/ColorMatrixColorFilter;-><init>(Landroid/graphics/ColorMatrix;)V */
/* .line 519 */
/* .local v2, "f":Landroid/graphics/ColorMatrixColorFilter; */
/* new-instance v4, Landroid/graphics/Paint; */
/* invoke-direct {v4}, Landroid/graphics/Paint;-><init>()V */
/* .line 520 */
/* .local v4, "paint":Landroid/graphics/Paint; */
(( android.graphics.Paint ) v4 ).setColorFilter ( v2 ); // invoke-virtual {v4, v2}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
/* .line 521 */
(( android.graphics.Canvas ) v0 ).drawBitmap ( p0, v8, v8, v4 ); // invoke-virtual {v0, p0, v8, v8, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 522 */
} // .end method
private java.lang.String externalizeAsset ( java.lang.String p0 ) {
/* .locals 17 */
/* .param p1, "assetName" # Ljava/lang/String; */
/* .prologue */
/* .line 436 */
int v8 = 0; // const/4 v8, 0x0
/* .line 437 */
/* .local v8, "inputStream":Ljava/io/InputStream; */
int v12 = 0; // const/4 v12, 0x0
/* .line 438 */
/* .local v12, "outputStream":Ljava/io/FileOutputStream; */
int v14 = 0; // const/4 v14, 0x0
/* .line 442 */
/* .local v14, "result":Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
/* .line 443 */
/* .local v2, "assetFilePath":Ljava/io/File; */
try { // :try_start_0
final String v15 = "/"; // const-string v15, "/"
/* move-object/from16 v0, p1 */
v15 = (( java.lang.String ) v0 ).startsWith ( v15 ); // invoke-virtual {v0, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v15 != null) { // if-eqz v15, :cond_3
/* .line 445 */
/* new-instance v3, Ljava/io/File; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
} // .end local v2 # "assetFilePath":Ljava/io/File;
/* .local v3, "assetFilePath":Ljava/io/File; */
/* move-object v2, v3 */
/* .line 454 */
} // .end local v3 # "assetFilePath":Ljava/io/File;
/* .restart local v2 # "assetFilePath":Ljava/io/File; */
} // :goto_0
v15 = (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
if ( v15 != null) { // if-eqz v15, :cond_4
/* .line 456 */
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 490 */
} // :cond_0
} // :goto_1
if ( v8 != null) { // if-eqz v8, :cond_1
/* .line 491 */
try { // :try_start_1
(( java.io.InputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 494 */
} // :cond_1
} // :goto_2
if ( v12 != null) { // if-eqz v12, :cond_2
/* .line 495 */
try { // :try_start_2
(( java.io.FileOutputStream ) v12 ).close ( ); // invoke-virtual {v12}, Ljava/io/FileOutputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_3 */
/* .line 500 */
} // :cond_2
} // :goto_3
/* .line 449 */
} // :cond_3
try { // :try_start_3
/* move-object/from16 v0, p0 */
v15 = this.myActivity;
final String v16 = "coronaResources"; // const-string v16, "coronaResources"
/* invoke-virtual/range {v15 ..v16}, Lcom/ansca/corona/CoronaActivity;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File; */
/* .line 450 */
/* .local v11, "ofdir":Ljava/io/File; */
/* new-instance v3, Ljava/io/File; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v3, v11, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end local v2 # "assetFilePath":Ljava/io/File;
/* .restart local v3 # "assetFilePath":Ljava/io/File; */
/* move-object v2, v3 */
} // .end local v3 # "assetFilePath":Ljava/io/File;
/* .restart local v2 # "assetFilePath":Ljava/io/File; */
/* .line 460 */
} // .end local v11 # "ofdir":Ljava/io/File;
} // :cond_4
/* move-object/from16 v0, p0 */
v15 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v15 ).getAssets ( ); // invoke-virtual {v15}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager;
/* .line 461 */
/* .local v4, "assetManager":Landroid/content/res/AssetManager; */
int v15 = 3; // const/4 v15, 0x3
/* move-object/from16 v0, p1 */
(( android.content.res.AssetManager ) v4 ).open ( v0, v15 ); // invoke-virtual {v4, v0, v15}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* .line 462 */
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 464 */
(( java.io.File ) v2 ).getParentFile ( ); // invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;
(( java.io.File ) v15 ).mkdirs ( ); // invoke-virtual {v15}, Ljava/io/File;->mkdirs()Z
/* .line 467 */
/* new-instance v13, Ljava/io/FileOutputStream; */
/* invoke-direct {v13, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 468 */
} // .end local v12 # "outputStream":Ljava/io/FileOutputStream;
/* .local v13, "outputStream":Ljava/io/FileOutputStream; */
try { // :try_start_4
v9 = (( java.io.InputStream ) v8 ).available ( ); // invoke-virtual {v8}, Ljava/io/InputStream;->available()I
/* .line 469 */
/* .local v9, "numBytes":I */
/* const/16 v1, 0x3e8 */
/* .line 470 */
/* .local v1, "BUFFER_SIZE":I */
/* if-lez v9, :cond_a */
/* .line 471 */
/* const/16 v15, 0x3e8 */
/* new-array v5, v15, [B */
/* .line 472 */
/* .local v5, "bytes":[B */
} // :goto_4
/* if-lez v9, :cond_6 */
/* .line 473 */
/* const/16 v6, 0x3e8 */
/* .line 474 */
/* .local v6, "bytesToRead":I */
/* if-le v6, v9, :cond_5 */
/* .line 475 */
/* move v6, v9 */
/* .line 476 */
} // :cond_5
int v15 = 0; // const/4 v15, 0x0
v10 = (( java.io.InputStream ) v8 ).read ( v5, v15, v6 ); // invoke-virtual {v8, v5, v15, v6}, Ljava/io/InputStream;->read([BII)I
/* .line 477 */
/* .local v10, "numRead":I */
int v15 = 0; // const/4 v15, 0x0
(( java.io.FileOutputStream ) v13 ).write ( v5, v15, v10 ); // invoke-virtual {v13, v5, v15, v10}, Ljava/io/FileOutputStream;->write([BII)V
/* .line 478 */
/* sub-int/2addr v9, v10 */
/* .line 479 */
/* .line 480 */
} // .end local v6 # "bytesToRead":I
} // .end local v10 # "numRead":I
} // :cond_6
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_7 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* move-object v12, v13 */
} // .end local v13 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v12 # "outputStream":Ljava/io/FileOutputStream; */
/* .line 485 */
} // .end local v1 # "BUFFER_SIZE":I
} // .end local v4 # "assetManager":Landroid/content/res/AssetManager;
} // .end local v5 # "bytes":[B
} // .end local v9 # "numBytes":I
/* :catch_0 */
/* move-exception v7 */
/* .line 486 */
/* .local v7, "ex":Ljava/lang/Exception; */
} // :goto_5
try { // :try_start_5
(( java.lang.Exception ) v7 ).printStackTrace ( ); // invoke-virtual {v7}, Ljava/lang/Exception;->printStackTrace()V
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 490 */
if ( v8 != null) { // if-eqz v8, :cond_7
/* .line 491 */
try { // :try_start_6
(( java.io.InputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/InputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_4 */
/* .line 494 */
} // :cond_7
} // :goto_6
if ( v12 != null) { // if-eqz v12, :cond_2
/* .line 495 */
try { // :try_start_7
(( java.io.FileOutputStream ) v12 ).close ( ); // invoke-virtual {v12}, Ljava/io/FileOutputStream;->close()V
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_1 */
/* .line 496 */
/* :catch_1 */
/* move-exception v15 */
/* .line 490 */
} // .end local v7 # "ex":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v15 */
} // :goto_7
if ( v8 != null) { // if-eqz v8, :cond_8
/* .line 491 */
try { // :try_start_8
(( java.io.InputStream ) v8 ).close ( ); // invoke-virtual {v8}, Ljava/io/InputStream;->close()V
/* :try_end_8 */
/* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_5 */
/* .line 494 */
} // :cond_8
} // :goto_8
if ( v12 != null) { // if-eqz v12, :cond_9
/* .line 495 */
try { // :try_start_9
(( java.io.FileOutputStream ) v12 ).close ( ); // invoke-virtual {v12}, Ljava/io/FileOutputStream;->close()V
/* :try_end_9 */
/* .catch Ljava/lang/Exception; {:try_start_9 ..:try_end_9} :catch_6 */
/* .line 496 */
} // :cond_9
} // :goto_9
/* throw v15 */
/* .line 492 */
/* :catch_2 */
/* move-exception v15 */
/* .line 496 */
/* :catch_3 */
/* move-exception v15 */
/* .line 492 */
/* .restart local v7 # "ex":Ljava/lang/Exception; */
/* :catch_4 */
/* move-exception v15 */
} // .end local v7 # "ex":Ljava/lang/Exception;
/* :catch_5 */
/* move-exception v16 */
/* .line 496 */
/* :catch_6 */
/* move-exception v16 */
/* .line 490 */
} // .end local v12 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v4 # "assetManager":Landroid/content/res/AssetManager; */
/* .restart local v13 # "outputStream":Ljava/io/FileOutputStream; */
/* :catchall_1 */
/* move-exception v15 */
/* move-object v12, v13 */
} // .end local v13 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v12 # "outputStream":Ljava/io/FileOutputStream; */
/* .line 485 */
} // .end local v12 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v13 # "outputStream":Ljava/io/FileOutputStream; */
/* :catch_7 */
/* move-exception v7 */
/* move-object v12, v13 */
} // .end local v13 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v12 # "outputStream":Ljava/io/FileOutputStream; */
} // .end local v12 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v1 # "BUFFER_SIZE":I */
/* .restart local v9 # "numBytes":I */
/* .restart local v13 # "outputStream":Ljava/io/FileOutputStream; */
} // :cond_a
/* move-object v12, v13 */
} // .end local v13 # "outputStream":Ljava/io/FileOutputStream;
/* .restart local v12 # "outputStream":Ljava/io/FileOutputStream; */
/* goto/16 :goto_1 */
} // .end method
private getBitmapAsset ( java.lang.String p0 ) {
/* .locals 10 */
/* .param p1, "assetName" # Ljava/lang/String; */
/* .prologue */
/* .line 790 */
int v1 = 0; // const/4 v1, 0x0
/* .line 793 */
/* .local v1, "pixels":[I */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/NativeToJavaBridge;->createBitmap(Ljava/lang/String;)Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult; */
/* .line 794 */
/* .local v9, "result":Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult; */
if ( v9 != null) { // if-eqz v9, :cond_1
(( com.ansca.corona.NativeToJavaBridge$LoadBitmapResult ) v9 ).getBitmap ( ); // invoke-virtual {v9}, Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult;->getBitmap()Landroid/graphics/Bitmap;
/* .line 795 */
/* .local v0, "bitmap":Landroid/graphics/Bitmap; */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 797 */
v2 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* iput v2, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapWidth:I */
/* .line 798 */
v2 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* iput v2, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapHeight:I */
/* .line 799 */
v2 = (( com.ansca.corona.NativeToJavaBridge$LoadBitmapResult ) v9 ).getScaleFactor ( ); // invoke-virtual {v9}, Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult;->getScaleFactor()F
/* iput v2, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapScaleFactor:F */
/* .line 803 */
try { // :try_start_0
v2 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
v3 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* mul-int/2addr v2, v3 */
/* new-array v1, v2, [I */
/* .line 804 */
int v2 = 0; // const/4 v2, 0x0
v3 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
v6 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
v7 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* invoke-virtual/range {v0 ..v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
/* :try_end_0 */
/* .catch Ljava/lang/OutOfMemoryError; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 814 */
} // :goto_1
(( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
/* .line 818 */
} // :cond_0
/* .line 794 */
} // .end local v0 # "bitmap":Landroid/graphics/Bitmap;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 806 */
/* .restart local v0 # "bitmap":Landroid/graphics/Bitmap; */
/* :catch_0 */
/* move-exception v8 */
/* .line 807 */
/* .local v8, "ex":Ljava/lang/OutOfMemoryError; */
v2 = java.lang.System.out;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "getBitmapAsset: Ran out of memory in the Java VM loading an image ("; // const-string v4, "getBitmapAsset: Ran out of memory in the Java VM loading an image ("
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = ") of size "; // const-string v4, ") of size "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v4, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapWidth:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = "x"; // const-string v4, "x"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v4, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapHeight:I */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v2 ).println ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 811 */
} // .end local v8 # "ex":Ljava/lang/OutOfMemoryError;
/* :catch_1 */
/* move-exception v8 */
/* .line 812 */
/* .local v8, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v8 ).printStackTrace ( ); // invoke-virtual {v8}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
private android.graphics.BitmapFactory$Options getBitmapFileInfo ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p1, "imageFileName" # Ljava/lang/String; */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 581 */
int v2 = 0; // const/4 v2, 0x0
/* .line 584 */
/* .local v2, "options":Landroid/graphics/BitmapFactory$Options; */
if ( p1 != null) { // if-eqz p1, :cond_0
v6 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-gtz v6, :cond_1 */
/* .line 617 */
} // :cond_0
} // :goto_0
/* .line 592 */
} // :cond_1
try { // :try_start_0
v5 = /* invoke-direct {p0, p1}, Lcom/ansca/corona/NativeToJavaBridge;->isAssetFile(Ljava/lang/String;)Z */
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 593 */
v5 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v5 ).getAssets ( ); // invoke-virtual {v5}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager;
/* .line 594 */
/* .local v0, "assetManager":Landroid/content/res/AssetManager; */
int v5 = 3; // const/4 v5, 0x3
(( android.content.res.AssetManager ) v0 ).open ( p1, v5 ); // invoke-virtual {v0, p1, v5}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* .line 599 */
} // .end local v0 # "assetManager":Landroid/content/res/AssetManager;
/* .local v4, "stream":Ljava/io/InputStream; */
} // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 601 */
/* new-instance v3, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 602 */
} // .end local v2 # "options":Landroid/graphics/BitmapFactory$Options;
/* .local v3, "options":Landroid/graphics/BitmapFactory$Options; */
int v5 = 1; // const/4 v5, 0x1
try { // :try_start_1
/* iput-boolean v5, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z */
/* .line 603 */
int v5 = 0; // const/4 v5, 0x0
android.graphics.BitmapFactory .decodeStream ( v4,v5,v3 );
/* .line 607 */
/* iget v5, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* if-gez v5, :cond_4 */
/* .line 608 */
int v2 = 0; // const/4 v2, 0x0
} // .end local v3 # "options":Landroid/graphics/BitmapFactory$Options;
} // .end local v4 # "stream":Ljava/io/InputStream;
/* .restart local v2 # "options":Landroid/graphics/BitmapFactory$Options; */
} // :cond_2
} // :goto_2
/* move-object v5, v2 */
/* .line 617 */
/* .line 597 */
} // :cond_3
try { // :try_start_2
/* new-instance v4, Ljava/io/FileInputStream; */
/* invoke-direct {v4, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .restart local v4 # "stream":Ljava/io/InputStream; */
/* .line 612 */
} // .end local v4 # "stream":Ljava/io/InputStream;
/* :catch_0 */
/* move-exception v1 */
/* .line 613 */
/* .local v1, "ex":Ljava/lang/Exception; */
} // :goto_3
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
/* .line 612 */
} // .end local v1 # "ex":Ljava/lang/Exception;
} // .end local v2 # "options":Landroid/graphics/BitmapFactory$Options;
/* .restart local v3 # "options":Landroid/graphics/BitmapFactory$Options; */
/* .restart local v4 # "stream":Ljava/io/InputStream; */
/* :catch_1 */
/* move-exception v1 */
/* move-object v2, v3 */
} // .end local v3 # "options":Landroid/graphics/BitmapFactory$Options;
/* .restart local v2 # "options":Landroid/graphics/BitmapFactory$Options; */
} // .end local v2 # "options":Landroid/graphics/BitmapFactory$Options;
/* .restart local v3 # "options":Landroid/graphics/BitmapFactory$Options; */
} // :cond_4
/* move-object v2, v3 */
} // .end local v3 # "options":Landroid/graphics/BitmapFactory$Options;
/* .restart local v2 # "options":Landroid/graphics/BitmapFactory$Options; */
} // .end method
private getBitmapMaskAsset ( java.lang.String p0 ) {
/* .locals 13 */
/* .param p1, "assetName" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 823 */
int v8 = 0; // const/4 v8, 0x0
/* .line 825 */
/* .local v8, "bytes":[B */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/NativeToJavaBridge;->createBitmap(Ljava/lang/String;)Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult; */
/* .line 826 */
/* .local v12, "result":Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult; */
if ( v12 != null) { // if-eqz v12, :cond_0
(( com.ansca.corona.NativeToJavaBridge$LoadBitmapResult ) v12 ).getBitmap ( ); // invoke-virtual {v12}, Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult;->getBitmap()Landroid/graphics/Bitmap;
/* .line 827 */
/* .local v0, "bitmap":Landroid/graphics/Bitmap; */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 828 */
/* move-object v11, v0 */
/* .line 829 */
/* .local v11, "oldBitmap":Landroid/graphics/Bitmap; */
com.ansca.corona.NativeToJavaBridge .createGrayscaleBitmap ( v11 );
/* .line 830 */
(( android.graphics.Bitmap ) v11 ).recycle ( ); // invoke-virtual {v11}, Landroid/graphics/Bitmap;->recycle()V
/* .line 832 */
v3 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* iput v3, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapWidth:I */
/* .line 833 */
v3 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* iput v3, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapHeight:I */
/* .line 834 */
v3 = (( com.ansca.corona.NativeToJavaBridge$LoadBitmapResult ) v12 ).getScaleFactor ( ); // invoke-virtual {v12}, Lcom/ansca/corona/NativeToJavaBridge$LoadBitmapResult;->getScaleFactor()F
/* iput v3, p0, Lcom/ansca/corona/NativeToJavaBridge;->myLastBitmapScaleFactor:F */
/* .line 836 */
v3 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
v4 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* mul-int v10, v3, v4 */
/* .line 837 */
/* .local v10, "numPixels":I */
/* new-array v1, v10, [I */
/* .line 838 */
/* .local v1, "pixels":[I */
v3 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
v6 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
v7 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* move v4, v2 */
/* move v5, v2 */
/* invoke-virtual/range {v0 ..v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
/* .line 839 */
(( android.graphics.Bitmap ) v0 ).recycle ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
/* .line 841 */
/* new-array v8, v10, [B */
/* .line 842 */
int v9 = 0; // const/4 v9, 0x0
/* .local v9, "i":I */
} // :goto_1
/* if-ge v9, v10, :cond_1 */
/* .line 845 */
/* aget v2, v1, v9 */
v2 = android.graphics.Color .red ( v2 );
/* and-int/lit16 v2, v2, 0xff */
/* int-to-byte v2, v2 */
/* aput-byte v2, v8, v9 */
/* .line 842 */
/* add-int/lit8 v9, v9, 0x1 */
/* .line 826 */
} // .end local v0 # "bitmap":Landroid/graphics/Bitmap;
} // .end local v1 # "pixels":[I
} // .end local v9 # "i":I
} // .end local v10 # "numPixels":I
} // .end local v11 # "oldBitmap":Landroid/graphics/Bitmap;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 849 */
/* .restart local v0 # "bitmap":Landroid/graphics/Bitmap; */
} // :cond_1
} // .end method
private static com.ansca.corona.NativeToJavaBridge getBridge ( ) {
/* .locals 1 */
/* .prologue */
/* .line 300 */
com.ansca.corona.Controller .getBridge ( );
} // .end method
private Boolean getRawAssetExists ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p1, "assetName" # Ljava/lang/String; */
/* .prologue */
/* .line 356 */
int v3 = 0; // const/4 v3, 0x0
/* .line 358 */
/* .local v3, "result":Z */
v4 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v4 ).getAssets ( ); // invoke-virtual {v4}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager;
/* .line 361 */
/* .local v0, "assetManager":Landroid/content/res/AssetManager; */
int v4 = 3; // const/4 v4, 0x3
try { // :try_start_0
(( android.content.res.AssetManager ) v0 ).open ( p1, v4 ); // invoke-virtual {v0, p1, v4}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* .line 362 */
/* .local v2, "is":Ljava/io/InputStream; */
if ( v2 != null) { // if-eqz v2, :cond_1
int v3 = 1; // const/4 v3, 0x1
/* .line 363 */
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 364 */
(( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 371 */
} // .end local v2 # "is":Ljava/io/InputStream;
} // :cond_0
} // :goto_1
/* .line 362 */
/* .restart local v2 # "is":Ljava/io/InputStream; */
} // :cond_1
int v3 = 0; // const/4 v3, 0x0
/* .line 366 */
} // .end local v2 # "is":Ljava/io/InputStream;
/* :catch_0 */
/* move-exception v1 */
/* .line 367 */
/* .local v1, "e":Ljava/io/IOException; */
final String v4 = "Corona"; // const-string v4, "Corona"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "WARNING: asset file "; // const-string v6, "WARNING: asset file "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p1 ); // invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = " does not exist"; // const-string v6, " does not exist"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v4,v5 );
} // .end method
private Boolean isAssetFile ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "fileName" # Ljava/lang/String; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 561 */
if ( p1 != null) { // if-eqz p1, :cond_0
v1 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-gtz v1, :cond_1 */
/* .line 571 */
} // :cond_0
} // :goto_0
/* .line 566 */
} // :cond_1
v1 = java.io.File.separator;
v1 = (( java.lang.String ) p1 ).startsWith ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
/* .line 567 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
private void networkRequest ( java.lang.String p0, java.lang.String p1, Integer p2, java.util.HashMap p3, java.lang.String p4, java.lang.String p5 ) {
/* .locals 7 */
/* .param p1, "url" # Ljava/lang/String; */
/* .param p2, "method" # Ljava/lang/String; */
/* .param p3, "listenerId" # I */
/* .param p4, "headers" # Ljava/util/HashMap; */
/* .param p5, "body" # Ljava/lang/String; */
/* .param p6, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 979 */
/* new-instance v0, Lcom/loopj/android/http/AsyncHttpClient; */
final String v4 = "My User Agent"; // const-string v4, "My User Agent"
/* invoke-direct {v0, v4}, Lcom/loopj/android/http/AsyncHttpClient;-><init>(Ljava/lang/String;)V */
/* .line 980 */
/* .local v0, "client":Lcom/loopj/android/http/AsyncHttpClient; */
/* new-instance v2, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler; */
/* invoke-direct {v2, p0, p3, p6, p1}, Lcom/ansca/corona/NativeToJavaBridge$NetworkRequestHandler;-><init>(Lcom/ansca/corona/NativeToJavaBridge;ILjava/lang/String;Ljava/lang/String;)V */
/* .line 987 */
/* .local v2, "handler":Lcom/loopj/android/http/AsyncHttpResponseHandler; */
try { // :try_start_0
/* new-instance v3, Ljava/net/URL; */
/* invoke-direct {v3, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 989 */
/* .local v3, "javaurl":Ljava/net/URL; */
final String v4 = "get"; // const-string v4, "get"
v4 = (( java.lang.String ) p2 ).equalsIgnoreCase ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 990 */
(( com.loopj.android.http.AsyncHttpClient ) v0 ).get ( p1, p4, v2 ); // invoke-virtual {v0, p1, p4, v2}, Lcom/loopj/android/http/AsyncHttpClient;->get(Ljava/lang/String;Ljava/util/HashMap;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V
/* .line 1017 */
} // .end local v3 # "javaurl":Ljava/net/URL;
} // :cond_0
} // :goto_0
return;
/* .line 992 */
/* .restart local v3 # "javaurl":Ljava/net/URL; */
} // :cond_1
final String v4 = "head"; // const-string v4, "head"
v4 = (( java.lang.String ) p2 ).equalsIgnoreCase ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 993 */
(( com.loopj.android.http.AsyncHttpClient ) v0 ).head ( p1, p4, v2 ); // invoke-virtual {v0, p1, p4, v2}, Lcom/loopj/android/http/AsyncHttpClient;->head(Ljava/lang/String;Ljava/util/HashMap;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1008 */
} // .end local v3 # "javaurl":Ljava/net/URL;
/* :catch_0 */
/* move-exception v1 */
/* .line 1011 */
/* .local v1, "ex":Ljava/lang/Exception; */
if ( p3 != null) { // if-eqz p3, :cond_0
v4 = com.ansca.corona.Controller .isValid ( );
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 1013 */
com.ansca.corona.Controller .getEventManager ( );
(( java.lang.Exception ) v1 ).getMessage ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( com.ansca.corona.events.EventManager ) v4 ).networkRequestEvent ( p3, v5, p1 ); // invoke-virtual {v4, p3, v5, p1}, Lcom/ansca/corona/events/EventManager;->networkRequestEvent(ILjava/lang/String;Ljava/lang/String;)V
/* .line 995 */
} // .end local v1 # "ex":Ljava/lang/Exception;
/* .restart local v3 # "javaurl":Ljava/net/URL; */
} // :cond_2
try { // :try_start_1
final String v4 = "delete"; // const-string v4, "delete"
v4 = (( java.lang.String ) p2 ).equalsIgnoreCase ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 996 */
(( com.loopj.android.http.AsyncHttpClient ) v0 ).delete ( p1, p4, v2 ); // invoke-virtual {v0, p1, p4, v2}, Lcom/loopj/android/http/AsyncHttpClient;->delete(Ljava/lang/String;Ljava/util/HashMap;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V
/* .line 998 */
} // :cond_3
final String v4 = "put"; // const-string v4, "put"
v4 = (( java.lang.String ) p2 ).equalsIgnoreCase ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 999 */
(( com.loopj.android.http.AsyncHttpClient ) v0 ).put ( p1, p4, p5, v2 ); // invoke-virtual {v0, p1, p4, p5, v2}, Lcom/loopj/android/http/AsyncHttpClient;->put(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V
/* .line 1001 */
} // :cond_4
final String v4 = "post"; // const-string v4, "post"
v4 = (( java.lang.String ) p2 ).equalsIgnoreCase ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 1002 */
(( com.loopj.android.http.AsyncHttpClient ) v0 ).post ( p1, p4, p5, v2 ); // invoke-virtual {v0, p1, p4, p5, v2}, Lcom/loopj/android/http/AsyncHttpClient;->post(Ljava/lang/String;Ljava/util/HashMap;Ljava/lang/String;Lcom/loopj/android/http/AsyncHttpResponseHandler;)V
/* .line 1005 */
} // :cond_5
/* new-instance v4, Ljava/lang/Exception; */
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "HTTP method \'"; // const-string v6, "HTTP method \'"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "\' not supported"; // const-string v6, "\' not supported"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v4, v5}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v4 */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
protected static void ping ( ) {
/* .locals 2 */
/* .prologue */
/* .line 295 */
v0 = java.lang.System.out;
final String v1 = "NativeToJavaBridge.ping()"; // const-string v1, "NativeToJavaBridge.ping()"
(( java.io.PrintStream ) v0 ).println ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 296 */
return;
} // .end method
/* # virtual methods */
public com.ansca.corona.CoronaActivity getActivity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 267 */
v0 = this.myActivity;
} // .end method
public getBytesFromFile ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p1, "filePathName" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 387 */
if ( p1 != null) { // if-eqz p1, :cond_0
v7 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-gtz v7, :cond_1 */
/* .line 428 */
} // :cond_0
} // :goto_0
/* .line 392 */
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
/* .line 393 */
/* .local v5, "stream":Ljava/io/InputStream; */
v4 = /* invoke-direct {p0, p1}, Lcom/ansca/corona/NativeToJavaBridge;->isAssetFile(Ljava/lang/String;)Z */
/* .line 395 */
/* .local v4, "isAssetFile":Z */
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 396 */
try { // :try_start_0
v7 = this.myActivity;
(( com.ansca.corona.CoronaActivity ) v7 ).getAssets ( ); // invoke-virtual {v7}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager;
/* .line 397 */
/* .local v0, "assetManager":Landroid/content/res/AssetManager; */
int v7 = 3; // const/4 v7, 0x3
(( android.content.res.AssetManager ) v0 ).open ( p1, v7 ); // invoke-virtual {v0, p1, v7}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 406 */
} // .end local v0 # "assetManager":Landroid/content/res/AssetManager;
} // :goto_1
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 411 */
int v2 = 0; // const/4 v2, 0x0
/* .line 413 */
/* .local v2, "bytes":[B */
try { // :try_start_1
v1 = (( java.io.InputStream ) v5 ).available ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->available()I
/* .line 414 */
/* .local v1, "byteCount":I */
/* if-lez v1, :cond_2 */
/* .line 415 */
/* new-array v2, v1, [B */
/* .line 416 */
(( java.io.InputStream ) v5 ).read ( v2 ); // invoke-virtual {v5, v2}, Ljava/io/InputStream;->read([B)I
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 422 */
} // .end local v1 # "byteCount":I
} // :cond_2
} // :goto_2
try { // :try_start_2
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 423 */
/* :catch_0 */
/* move-exception v3 */
/* .line 424 */
/* .local v3, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
/* .line 400 */
} // .end local v2 # "bytes":[B
} // .end local v3 # "ex":Ljava/lang/Exception;
} // :cond_3
try { // :try_start_3
/* new-instance v6, Ljava/io/FileInputStream; */
/* invoke-direct {v6, p1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
} // .end local v5 # "stream":Ljava/io/InputStream;
/* .local v6, "stream":Ljava/io/InputStream; */
/* move-object v5, v6 */
} // .end local v6 # "stream":Ljava/io/InputStream;
/* .restart local v5 # "stream":Ljava/io/InputStream; */
/* .line 403 */
/* :catch_1 */
/* move-exception v3 */
/* .line 404 */
/* .restart local v3 # "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
/* .line 419 */
} // .end local v3 # "ex":Ljava/lang/Exception;
/* .restart local v2 # "bytes":[B */
/* :catch_2 */
/* move-exception v3 */
/* .line 420 */
/* .restart local v3 # "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
