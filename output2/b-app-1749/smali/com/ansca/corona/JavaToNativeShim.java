public class com.ansca.corona.JavaToNativeShim {
	 /* .source "JavaToNativeShim.java" */
	 /* # static fields */
	 public static final Integer EventTypeAccelerometer;
	 public static final Integer EventTypeGyroscope;
	 public static final Integer EventTypeHeading;
	 public static final Integer EventTypeLocation;
	 public static final Integer EventTypeMultitouch;
	 public static final Integer EventTypeNumTypes;
	 public static final Integer EventTypeOrientation;
	 public static final Integer EventTypeUnknown;
	 public static final Integer FBConnectSessionEventLogin;
	 public static final Integer FBConnectSessionEventLoginCancelled;
	 public static final Integer FBConnectSessionEventLoginFailed;
	 public static final Integer FBConnectSessionEventLogout;
	 public static final Integer TouchEventPhaseBegan;
	 public static final Integer TouchEventPhaseCancelled;
	 public static final Integer TouchEventPhaseEnded;
	 public static final Integer TouchEventPhaseMoved;
	 public static final Integer TouchEventPhaseStationary;
	 /* # direct methods */
	 static com.ansca.corona.JavaToNativeShim ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 83 */
		 final String v0 = "lua"; // const-string v0, "lua"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 84 */
		 final String v0 = "jnlua5.1"; // const-string v0, "jnlua5.1"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 85 */
		 final String v0 = "openal"; // const-string v0, "openal"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 86 */
		 final String v0 = "mpg123"; // const-string v0, "mpg123"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 87 */
		 final String v0 = "vorbisidec"; // const-string v0, "vorbisidec"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 88 */
		 final String v0 = "almixer"; // const-string v0, "almixer"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 89 */
		 final String v0 = "corona"; // const-string v0, "corona"
		 java.lang.System .loadLibrary ( v0 );
		 /* .line 90 */
		 return;
	 } // .end method
	 private com.ansca.corona.JavaToNativeShim ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 93 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static synchronized void accelerometerEvent ( Double p0, Double p1, Double p2, Double p3 ) {
		 /* .locals 2 */
		 /* .param p0, "x" # D */
		 /* .param p2, "y" # D */
		 /* .param p4, "z" # D */
		 /* .param p6, "deltaTime" # D */
		 /* .prologue */
		 /* .line 194 */
		 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
		 /* monitor-enter v0 */
		 try { // :try_start_0
			 /* invoke-static/range {p0 ..p7}, Lcom/ansca/corona/JavaToNativeShim;->nativeAccelerometerEvent(DDDD)V */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* .line 195 */
			 /* monitor-exit v0 */
			 return;
			 /* .line 194 */
			 /* :catchall_0 */
			 /* move-exception v1 */
			 /* monitor-exit v0 */
			 /* throw v1 */
		 } // .end method
		 public static synchronized void adRequestEvent ( Boolean p0 ) {
			 /* .locals 2 */
			 /* .param p0, "isError" # Z */
			 /* .prologue */
			 /* .line 275 */
			 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
			 /* monitor-enter v0 */
			 try { // :try_start_0
				 com.ansca.corona.JavaToNativeShim .nativeAdsRequestEvent ( p0 );
				 /* :try_end_0 */
				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
				 /* .line 276 */
				 /* monitor-exit v0 */
				 return;
				 /* .line 275 */
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* monitor-exit v0 */
				 /* throw v1 */
			 } // .end method
			 public static synchronized void alertCallback ( Integer p0 ) {
				 /* .locals 2 */
				 /* .param p0, "buttonIndex" # I */
				 /* .prologue */
				 /* .line 212 */
				 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
				 /* monitor-enter v0 */
				 try { // :try_start_0
					 com.ansca.corona.JavaToNativeShim .nativeAlertCallback ( p0 );
					 /* :try_end_0 */
					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
					 /* .line 213 */
					 /* monitor-exit v0 */
					 return;
					 /* .line 212 */
					 /* :catchall_0 */
					 /* move-exception v1 */
					 /* monitor-exit v0 */
					 /* throw v1 */
				 } // .end method
				 public static synchronized void creditsRequestEvent ( Integer p0, Integer p1 ) {
					 /* .locals 2 */
					 /* .param p0, "newPoints" # I */
					 /* .param p1, "totalPoints" # I */
					 /* .prologue */
					 /* .line 270 */
					 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
					 /* monitor-enter v0 */
					 try { // :try_start_0
						 com.ansca.corona.JavaToNativeShim .nativeCreditsRequestEvent ( p0,p1 );
						 /* :try_end_0 */
						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
						 /* .line 271 */
						 /* monitor-exit v0 */
						 return;
						 /* .line 270 */
						 /* :catchall_0 */
						 /* move-exception v1 */
						 /* monitor-exit v0 */
						 /* throw v1 */
					 } // .end method
					 public static synchronized void destroy ( ) {
						 /* .locals 2 */
						 /* .prologue */
						 /* .line 167 */
						 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
						 /* monitor-enter v0 */
						 try { // :try_start_0
							 com.ansca.corona.JavaToNativeShim .nativeDone ( );
							 /* :try_end_0 */
							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
							 /* .line 168 */
							 /* monitor-exit v0 */
							 return;
							 /* .line 167 */
							 /* :catchall_0 */
							 /* move-exception v1 */
							 /* monitor-exit v0 */
							 /* throw v1 */
						 } // .end method
						 public static synchronized void fbConnectRequestEvent ( java.lang.String p0, Boolean p1, Integer p2 ) {
							 /* .locals 2 */
							 /* .param p0, "msg" # Ljava/lang/String; */
							 /* .param p1, "isError" # Z */
							 /* .param p2, "didComplete" # I */
							 /* .prologue */
							 /* .line 260 */
							 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
							 /* monitor-enter v0 */
							 try { // :try_start_0
								 com.ansca.corona.JavaToNativeShim .nativeFBConnectRequestEvent ( p0,p1,p2 );
								 /* :try_end_0 */
								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
								 /* .line 261 */
								 /* monitor-exit v0 */
								 return;
								 /* .line 260 */
								 /* :catchall_0 */
								 /* move-exception v1 */
								 /* monitor-exit v0 */
								 /* throw v1 */
							 } // .end method
							 public static synchronized void fbConnectSessionEvent ( Integer p0, java.lang.String p1, Long p2 ) {
								 /* .locals 2 */
								 /* .param p0, "phase" # I */
								 /* .param p1, "accessToken" # Ljava/lang/String; */
								 /* .param p2, "accessTokenExpirationTimestamp" # J */
								 /* .prologue */
								 /* .line 250 */
								 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
								 /* monitor-enter v0 */
								 try { // :try_start_0
									 com.ansca.corona.JavaToNativeShim .nativeFBConnectSessionEvent ( p0,p1,p2,p3 );
									 /* :try_end_0 */
									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
									 /* .line 251 */
									 /* monitor-exit v0 */
									 return;
									 /* .line 250 */
									 /* :catchall_0 */
									 /* move-exception v1 */
									 /* monitor-exit v0 */
									 /* throw v1 */
								 } // .end method
								 public static synchronized void fbConnectSessionEventError ( java.lang.String p0 ) {
									 /* .locals 2 */
									 /* .param p0, "msg" # Ljava/lang/String; */
									 /* .prologue */
									 /* .line 255 */
									 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
									 /* monitor-enter v0 */
									 try { // :try_start_0
										 com.ansca.corona.JavaToNativeShim .nativeFBConnectSessionEventError ( p0 );
										 /* :try_end_0 */
										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
										 /* .line 256 */
										 /* monitor-exit v0 */
										 return;
										 /* .line 255 */
										 /* :catchall_0 */
										 /* move-exception v1 */
										 /* monitor-exit v0 */
										 /* throw v1 */
									 } // .end method
									 public static synchronized Integer getContentHeightInPixels ( ) {
										 /* .locals 2 */
										 /* .prologue */
										 /* .line 147 */
										 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
										 /* monitor-enter v0 */
										 try { // :try_start_0
											 com.ansca.corona.JavaToNativeShim .nativeGetContentHeightInPixels ( );
											 /* :try_end_0 */
											 v1 = 											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
											 /* monitor-exit v0 */
											 /* :catchall_0 */
											 /* move-exception v1 */
											 /* monitor-exit v0 */
											 /* throw v1 */
										 } // .end method
										 public static synchronized Integer getContentWidthInPixels ( ) {
											 /* .locals 2 */
											 /* .prologue */
											 /* .line 142 */
											 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
											 /* monitor-enter v0 */
											 try { // :try_start_0
												 com.ansca.corona.JavaToNativeShim .nativeGetContentWidthInPixels ( );
												 /* :try_end_0 */
												 v1 = 												 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
												 /* monitor-exit v0 */
												 /* :catchall_0 */
												 /* move-exception v1 */
												 /* monitor-exit v0 */
												 /* throw v1 */
											 } // .end method
											 public static synchronized Integer getHorizontalMarginInPixels ( ) {
												 /* .locals 2 */
												 /* .prologue */
												 /* .line 132 */
												 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
												 /* monitor-enter v0 */
												 try { // :try_start_0
													 com.ansca.corona.JavaToNativeShim .nativeGetHorizontalMarginInPixels ( );
													 /* :try_end_0 */
													 v1 = 													 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
													 /* monitor-exit v0 */
													 /* :catchall_0 */
													 /* move-exception v1 */
													 /* monitor-exit v0 */
													 /* throw v1 */
												 } // .end method
												 public static synchronized Integer getMaxTextureSize ( ) {
													 /* .locals 2 */
													 /* .prologue */
													 /* .line 127 */
													 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
													 /* monitor-enter v0 */
													 try { // :try_start_0
														 com.ansca.corona.JavaToNativeShim .nativeGetMaxTextureSize ( );
														 /* :try_end_0 */
														 v1 = 														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
														 /* monitor-exit v0 */
														 /* :catchall_0 */
														 /* move-exception v1 */
														 /* monitor-exit v0 */
														 /* throw v1 */
													 } // .end method
													 public static synchronized java.lang.String getVersion ( ) {
														 /* .locals 2 */
														 /* .prologue */
														 /* .line 97 */
														 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
														 /* monitor-enter v0 */
														 try { // :try_start_0
															 com.ansca.corona.JavaToNativeShim .nativeGetVersion ( );
															 /* :try_end_0 */
															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
															 /* monitor-exit v0 */
															 /* :catchall_0 */
															 /* move-exception v1 */
															 /* monitor-exit v0 */
															 /* throw v1 */
														 } // .end method
														 public static synchronized Integer getVerticalMarginInPixels ( ) {
															 /* .locals 2 */
															 /* .prologue */
															 /* .line 137 */
															 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
															 /* monitor-enter v0 */
															 try { // :try_start_0
																 com.ansca.corona.JavaToNativeShim .nativeGetVerticalMarginInPixels ( );
																 /* :try_end_0 */
																 v1 = 																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																 /* monitor-exit v0 */
																 /* :catchall_0 */
																 /* move-exception v1 */
																 /* monitor-exit v0 */
																 /* throw v1 */
															 } // .end method
															 public static synchronized void gyroscopeEvent ( Double p0, Double p1, Double p2, Double p3 ) {
																 /* .locals 2 */
																 /* .param p0, "x" # D */
																 /* .param p2, "y" # D */
																 /* .param p4, "z" # D */
																 /* .param p6, "deltaTime" # D */
																 /* .prologue */
																 /* .line 199 */
																 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																 /* monitor-enter v0 */
																 try { // :try_start_0
																	 /* invoke-static/range {p0 ..p7}, Lcom/ansca/corona/JavaToNativeShim;->nativeGyroscopeEvent(DDDD)V */
																	 /* :try_end_0 */
																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																	 /* .line 200 */
																	 /* monitor-exit v0 */
																	 return;
																	 /* .line 199 */
																	 /* :catchall_0 */
																	 /* move-exception v1 */
																	 /* monitor-exit v0 */
																	 /* throw v1 */
																 } // .end method
																 public static synchronized void imagePickerEvent ( java.lang.String p0 ) {
																	 /* .locals 2 */
																	 /* .param p0, "selectedImageFileName" # Ljava/lang/String; */
																	 /* .prologue */
																	 /* .line 280 */
																	 /* const-class v1, Lcom/ansca/corona/JavaToNativeShim; */
																	 /* monitor-enter v1 */
																	 /* if-nez p0, :cond_0 */
																	 /* .line 281 */
																	 try { // :try_start_0
																		 final String p0 = ""; // const-string p0, ""
																		 /* .line 283 */
																	 } // :cond_0
																	 com.ansca.corona.JavaToNativeShim .nativeImagePickerEvent ( p0 );
																	 /* :try_end_0 */
																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																	 /* .line 284 */
																	 /* monitor-exit v1 */
																	 return;
																	 /* .line 280 */
																	 /* :catchall_0 */
																	 /* move-exception v0 */
																	 /* monitor-exit v1 */
																	 /* throw v0 */
																 } // .end method
																 public static synchronized void init ( ) {
																	 /* .locals 2 */
																	 /* .prologue */
																	 /* .line 112 */
																	 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																	 /* monitor-enter v0 */
																	 try { // :try_start_0
																		 com.ansca.corona.JavaToNativeShim .nativeInit ( );
																		 /* :try_end_0 */
																		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																		 /* .line 113 */
																		 /* monitor-exit v0 */
																		 return;
																		 /* .line 112 */
																		 /* :catchall_0 */
																		 /* move-exception v1 */
																		 /* monitor-exit v0 */
																		 /* throw v1 */
																	 } // .end method
																	 public static synchronized Boolean keyEvent ( Integer p0, java.lang.String p1 ) {
																		 /* .locals 2 */
																		 /* .param p0, "phase" # I */
																		 /* .param p1, "keyName" # Ljava/lang/String; */
																		 /* .prologue */
																		 /* .line 189 */
																		 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																		 /* monitor-enter v0 */
																		 try { // :try_start_0
																			 com.ansca.corona.JavaToNativeShim .nativeKeyEvent ( p0,p1 );
																			 /* :try_end_0 */
																			 v1 = 																			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																			 /* monitor-exit v0 */
																			 /* :catchall_0 */
																			 /* move-exception v1 */
																			 /* monitor-exit v0 */
																			 /* throw v1 */
																		 } // .end method
																		 public static synchronized void locationEvent ( Double p0, Double p1, Double p2, Double p3, Double p4, Double p5, Double p6 ) {
																			 /* .locals 2 */
																			 /* .param p0, "latitude" # D */
																			 /* .param p2, "longitude" # D */
																			 /* .param p4, "altitude" # D */
																			 /* .param p6, "accuracy" # D */
																			 /* .param p8, "speed" # D */
																			 /* .param p10, "bearing" # D */
																			 /* .param p12, "time" # D */
																			 /* .prologue */
																			 /* .line 204 */
																			 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																			 /* monitor-enter v0 */
																			 try { // :try_start_0
																				 /* invoke-static/range {p0 ..p13}, Lcom/ansca/corona/JavaToNativeShim;->nativeLocationEvent(DDDDDDD)V */
																				 /* :try_end_0 */
																				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																				 /* .line 205 */
																				 /* monitor-exit v0 */
																				 return;
																				 /* .line 204 */
																				 /* :catchall_0 */
																				 /* move-exception v1 */
																				 /* monitor-exit v0 */
																				 /* throw v1 */
																			 } // .end method
																			 public static synchronized void memoryWarningEvent ( ) {
																				 /* .locals 2 */
																				 /* .prologue */
																				 /* .line 288 */
																				 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																				 /* monitor-enter v0 */
																				 try { // :try_start_0
																					 com.ansca.corona.JavaToNativeShim .nativeMemoryWarningEvent ( );
																					 /* :try_end_0 */
																					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																					 /* .line 289 */
																					 /* monitor-exit v0 */
																					 return;
																					 /* .line 288 */
																					 /* :catchall_0 */
																					 /* move-exception v1 */
																					 /* monitor-exit v0 */
																					 /* throw v1 */
																				 } // .end method
																				 public static synchronized void multitouchEventCallback ( java.lang.Object[] p0 ) {
																					 /* .locals 2 */
																					 /* .param p0, "touches" # [Ljava/lang/Object; */
																					 /* .prologue */
																					 /* .line 237 */
																					 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																					 /* monitor-enter v0 */
																					 try { // :try_start_0
																						 com.ansca.corona.JavaToNativeShim .nativeMultitouchEventCallback ( p0 );
																						 /* :try_end_0 */
																						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																						 /* .line 238 */
																						 /* monitor-exit v0 */
																						 return;
																						 /* .line 237 */
																						 /* :catchall_0 */
																						 /* move-exception v1 */
																						 /* monitor-exit v0 */
																						 /* throw v1 */
																					 } // .end method
																					 private static native void nativeAccelerometerEvent ( Double p0, Double p1, Double p2, Double p3 ) {
																					 } // .end method
																					 private static native void nativeAdsRequestEvent ( Boolean p0 ) {
																					 } // .end method
																					 private static native void nativeAlertCallback ( Integer p0 ) {
																					 } // .end method
																					 private static native void nativeCreditsRequestEvent ( Integer p0, Integer p1 ) {
																					 } // .end method
																					 private static native void nativeDone ( ) {
																					 } // .end method
																					 private static native void nativeFBConnectRequestEvent ( java.lang.String p0, Boolean p1, Integer p2 ) {
																					 } // .end method
																					 private static native void nativeFBConnectSessionEvent ( Integer p0, java.lang.String p1, Long p2 ) {
																					 } // .end method
																					 private static native void nativeFBConnectSessionEventError ( java.lang.String p0 ) {
																					 } // .end method
																					 private static native Integer nativeGetContentHeightInPixels ( ) {
																					 } // .end method
																					 private static native Integer nativeGetContentWidthInPixels ( ) {
																					 } // .end method
																					 private static native Integer nativeGetHorizontalMarginInPixels ( ) {
																					 } // .end method
																					 private static native Integer nativeGetMaxTextureSize ( ) {
																					 } // .end method
																					 private static native java.lang.String nativeGetVersion ( ) {
																					 } // .end method
																					 private static native Integer nativeGetVerticalMarginInPixels ( ) {
																					 } // .end method
																					 private static native void nativeGyroscopeEvent ( Double p0, Double p1, Double p2, Double p3 ) {
																					 } // .end method
																					 private static native void nativeImagePickerEvent ( java.lang.String p0 ) {
																					 } // .end method
																					 private static native void nativeInit ( ) {
																					 } // .end method
																					 private static native Boolean nativeKeyEvent ( Integer p0, java.lang.String p1 ) {
																					 } // .end method
																					 private static native void nativeLocationEvent ( Double p0, Double p1, Double p2, Double p3, Double p4, Double p5, Double p6 ) {
																					 } // .end method
																					 private static native void nativeMemoryWarningEvent ( ) {
																					 } // .end method
																					 private static native void nativeMultitouchEventCallback ( java.lang.Object[] p0 ) {
																					 } // .end method
																					 private static native void nativeNetworkRequestEvent ( Integer p0, java.lang.String p1, Boolean p2, Integer p3, java.lang.String p4 ) {
																					 } // .end method
																					 private static native void nativeOrientationChanged ( Integer p0, Integer p1 ) {
																					 } // .end method
																					 private static native void nativePause ( ) {
																					 } // .end method
																					 private static native void nativePopupClosedEvent ( java.lang.String p0, Boolean p1 ) {
																					 } // .end method
																					 private static native void nativeRecordCallback ( Integer p0, Integer p1 ) {
																					 } // .end method
																					 private static native void nativeReinitializeRenderer ( ) {
																					 } // .end method
																					 private static native void nativeRender ( ) {
																					 } // .end method
																					 private static native void nativeResize ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, Integer p5, Integer p6, Integer p7 ) {
																					 } // .end method
																					 private static native void nativeResume ( ) {
																					 } // .end method
																					 private static native void nativeSoundEndCallback ( Integer p0 ) {
																					 } // .end method
																					 private static native void nativeStoreTransactionEvent ( Integer p0, Integer p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6, java.lang.String p7, java.lang.String p8, java.lang.String p9 ) {
																					 } // .end method
																					 private static native void nativeTapEvent ( Integer p0, Integer p1, Integer p2 ) {
																					 } // .end method
																					 private static native void nativeTextEditingEvent ( Integer p0, Integer p1, Integer p2, java.lang.String p3, java.lang.String p4, java.lang.String p5 ) {
																					 } // .end method
																					 private static native void nativeTextEvent ( Integer p0, Boolean p1, Boolean p2 ) {
																					 } // .end method
																					 private static native void nativeTouchEvent ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
																					 } // .end method
																					 private static native void nativeUnloadResources ( ) {
																					 } // .end method
																					 private static native void nativeUseDefaultLuaErrorHandler ( ) {
																					 } // .end method
																					 private static native void nativeUseJavaLuaErrorHandler ( ) {
																					 } // .end method
																					 private static native void nativeVideoEndCallback ( Integer p0 ) {
																					 } // .end method
																					 private static native Boolean nativeWebPopupDidFailLoadUrl ( Integer p0, java.lang.String p1, java.lang.String p2, Integer p3 ) {
																					 } // .end method
																					 private static native Boolean nativeWebPopupShouldLoadUrl ( Integer p0, java.lang.String p1 ) {
																					 } // .end method
																					 public static synchronized void networkRequestEvent ( Integer p0, java.lang.String p1, Boolean p2, java.lang.String p3, Integer p4 ) {
																						 /* .locals 2 */
																						 /* .param p0, "listenerId" # I */
																						 /* .param p1, "response" # Ljava/lang/String; */
																						 /* .param p2, "isError" # Z */
																						 /* .param p3, "url" # Ljava/lang/String; */
																						 /* .param p4, "statusCode" # I */
																						 /* .prologue */
																						 /* .line 265 */
																						 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																						 /* monitor-enter v0 */
																						 try { // :try_start_0
																							 com.ansca.corona.JavaToNativeShim .nativeNetworkRequestEvent ( p0,p1,p2,p4,p3 );
																							 /* :try_end_0 */
																							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																							 /* .line 266 */
																							 /* monitor-exit v0 */
																							 return;
																							 /* .line 265 */
																							 /* :catchall_0 */
																							 /* move-exception v1 */
																							 /* monitor-exit v0 */
																							 /* throw v1 */
																						 } // .end method
																						 public static synchronized void orientationChanged ( Integer p0, Integer p1 ) {
																							 /* .locals 2 */
																							 /* .param p0, "newOrientation" # I */
																							 /* .param p1, "oldOrientation" # I */
																							 /* .prologue */
																							 /* .line 208 */
																							 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																							 /* monitor-enter v0 */
																							 try { // :try_start_0
																								 com.ansca.corona.JavaToNativeShim .nativeOrientationChanged ( p0,p1 );
																								 /* :try_end_0 */
																								 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																								 /* .line 209 */
																								 /* monitor-exit v0 */
																								 return;
																								 /* .line 208 */
																								 /* :catchall_0 */
																								 /* move-exception v1 */
																								 /* monitor-exit v0 */
																								 /* throw v1 */
																							 } // .end method
																							 public static synchronized void pause ( ) {
																								 /* .locals 2 */
																								 /* .prologue */
																								 /* .line 102 */
																								 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																								 /* monitor-enter v0 */
																								 try { // :try_start_0
																									 com.ansca.corona.JavaToNativeShim .nativePause ( );
																									 /* :try_end_0 */
																									 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																									 /* .line 103 */
																									 /* monitor-exit v0 */
																									 return;
																									 /* .line 102 */
																									 /* :catchall_0 */
																									 /* move-exception v1 */
																									 /* monitor-exit v0 */
																									 /* throw v1 */
																								 } // .end method
																								 public static synchronized void popupClosedEvent ( java.lang.String p0, Boolean p1 ) {
																									 /* .locals 2 */
																									 /* .param p0, "popupName" # Ljava/lang/String; */
																									 /* .param p1, "wasCanceled" # Z */
																									 /* .prologue */
																									 /* .line 293 */
																									 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																									 /* monitor-enter v0 */
																									 try { // :try_start_0
																										 com.ansca.corona.JavaToNativeShim .nativePopupClosedEvent ( p0,p1 );
																										 /* :try_end_0 */
																										 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																										 /* .line 294 */
																										 /* monitor-exit v0 */
																										 return;
																										 /* .line 293 */
																										 /* :catchall_0 */
																										 /* move-exception v1 */
																										 /* monitor-exit v0 */
																										 /* throw v1 */
																									 } // .end method
																									 public static synchronized void recordCallback ( Integer p0, Integer p1 ) {
																										 /* .locals 2 */
																										 /* .param p0, "id" # I */
																										 /* .param p1, "status" # I */
																										 /* .prologue */
																										 /* .line 224 */
																										 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																										 /* monitor-enter v0 */
																										 try { // :try_start_0
																											 com.ansca.corona.JavaToNativeShim .nativeRecordCallback ( p0,p1 );
																											 /* :try_end_0 */
																											 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																											 /* .line 225 */
																											 /* monitor-exit v0 */
																											 return;
																											 /* .line 224 */
																											 /* :catchall_0 */
																											 /* move-exception v1 */
																											 /* monitor-exit v0 */
																											 /* throw v1 */
																										 } // .end method
																										 public static synchronized void reinitializeRenderer ( ) {
																											 /* .locals 2 */
																											 /* .prologue */
																											 /* .line 122 */
																											 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																											 /* monitor-enter v0 */
																											 try { // :try_start_0
																												 com.ansca.corona.JavaToNativeShim .nativeReinitializeRenderer ( );
																												 /* :try_end_0 */
																												 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																												 /* .line 123 */
																												 /* monitor-exit v0 */
																												 return;
																												 /* .line 122 */
																												 /* :catchall_0 */
																												 /* move-exception v1 */
																												 /* monitor-exit v0 */
																												 /* throw v1 */
																											 } // .end method
																											 public static synchronized void render ( ) {
																												 /* .locals 2 */
																												 /* .prologue */
																												 /* .line 117 */
																												 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																												 /* monitor-enter v0 */
																												 try { // :try_start_0
																													 com.ansca.corona.JavaToNativeShim .nativeRender ( );
																													 /* :try_end_0 */
																													 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																													 /* .line 118 */
																													 /* monitor-exit v0 */
																													 return;
																													 /* .line 117 */
																													 /* :catchall_0 */
																													 /* move-exception v1 */
																													 /* monitor-exit v0 */
																													 /* throw v1 */
																												 } // .end method
																												 public static synchronized void resize ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, Integer p5, Integer p6, Integer p7 ) {
																													 /* .locals 2 */
																													 /* .param p0, "packageName" # Ljava/lang/String; */
																													 /* .param p1, "documentsDir" # Ljava/lang/String; */
																													 /* .param p2, "temporaryDir" # Ljava/lang/String; */
																													 /* .param p3, "cachesDir" # Ljava/lang/String; */
																													 /* .param p4, "systemCachesDir" # Ljava/lang/String; */
																													 /* .param p5, "w" # I */
																													 /* .param p6, "h" # I */
																													 /* .param p7, "orientation" # I */
																													 /* .prologue */
																													 /* .line 174 */
																													 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																													 /* monitor-enter v0 */
																													 try { // :try_start_0
																														 /* invoke-static/range {p0 ..p7}, Lcom/ansca/corona/JavaToNativeShim;->nativeResize(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V */
																														 /* :try_end_0 */
																														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																														 /* .line 175 */
																														 /* monitor-exit v0 */
																														 return;
																														 /* .line 174 */
																														 /* :catchall_0 */
																														 /* move-exception v1 */
																														 /* monitor-exit v0 */
																														 /* throw v1 */
																													 } // .end method
																													 public static synchronized void resume ( ) {
																														 /* .locals 2 */
																														 /* .prologue */
																														 /* .line 107 */
																														 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																														 /* monitor-enter v0 */
																														 try { // :try_start_0
																															 com.ansca.corona.JavaToNativeShim .nativeResume ( );
																															 /* :try_end_0 */
																															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																															 /* .line 108 */
																															 /* monitor-exit v0 */
																															 return;
																															 /* .line 107 */
																															 /* :catchall_0 */
																															 /* move-exception v1 */
																															 /* monitor-exit v0 */
																															 /* throw v1 */
																														 } // .end method
																														 public static synchronized void soundEndCallback ( Integer p0 ) {
																															 /* .locals 2 */
																															 /* .param p0, "id" # I */
																															 /* .prologue */
																															 /* .line 216 */
																															 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																															 /* monitor-enter v0 */
																															 try { // :try_start_0
																																 com.ansca.corona.JavaToNativeShim .nativeSoundEndCallback ( p0 );
																																 /* :try_end_0 */
																																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																 /* .line 217 */
																																 /* monitor-exit v0 */
																																 return;
																																 /* .line 216 */
																																 /* :catchall_0 */
																																 /* move-exception v1 */
																																 /* monitor-exit v0 */
																																 /* throw v1 */
																															 } // .end method
																															 public static synchronized void storeTransactionEvent ( com.ansca.corona.purchasing.StoreTransactionResultSettings p0 ) {
																																 /* .locals 11 */
																																 /* .param p0, "result" # Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
																																 /* .prologue */
																																 /* .line 299 */
																																 /* const-class v10, Lcom/ansca/corona/JavaToNativeShim; */
																																 /* monitor-enter v10 */
																																 /* if-nez p0, :cond_0 */
																																 /* .line 319 */
																															 } // :goto_0
																															 /* monitor-exit v10 */
																															 return;
																															 /* .line 304 */
																														 } // :cond_0
																														 try { // :try_start_0
																															 final String v6 = ""; // const-string v6, ""
																															 /* .line 305 */
																															 /* .local v6, "transactionTimeString":Ljava/lang/String; */
																															 final String v9 = ""; // const-string v9, ""
																															 /* .line 306 */
																															 /* .local v9, "originalTransactionTimeString":Ljava/lang/String; */
																															 v0 = 																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).hasTransactionTime ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->hasTransactionTime()Z
																															 if ( v0 != null) { // if-eqz v0, :cond_1
																																 /* .line 307 */
																																 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getTransactionTime ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getTransactionTime()Ljava/util/Date;
																																 (( java.util.Date ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/Date;->toString()Ljava/lang/String;
																																 /* .line 309 */
																															 } // :cond_1
																															 v0 = 																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).hasOriginalTransactionTime ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->hasOriginalTransactionTime()Z
																															 if ( v0 != null) { // if-eqz v0, :cond_2
																																 /* .line 310 */
																																 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getOriginalTransactionTime ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getOriginalTransactionTime()Ljava/util/Date;
																																 (( java.util.Date ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/Date;->toString()Ljava/lang/String;
																																 /* .line 314 */
																															 } // :cond_2
																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getState ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getState()Lcom/ansca/corona/purchasing/StoreTransactionState;
																															 v0 = 																															 (( com.ansca.corona.purchasing.StoreTransactionState ) v0 ).toValue ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/StoreTransactionState;->toValue()I
																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getErrorType ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getErrorType()Lcom/ansca/corona/purchasing/StoreTransactionErrorType;
																															 v1 = 																															 (( com.ansca.corona.purchasing.StoreTransactionErrorType ) v1 ).toValue ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/StoreTransactionErrorType;->toValue()I
																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getErrorMessage ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getErrorMessage()Ljava/lang/String;
																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getProductName ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getProductName()Ljava/lang/String;
																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getReceipt ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getReceipt()Ljava/lang/String;
																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getTransactionStringId ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getTransactionStringId()Ljava/lang/String;
																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getOriginalReceipt ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getOriginalReceipt()Ljava/lang/String;
																															 (( com.ansca.corona.purchasing.StoreTransactionResultSettings ) p0 ).getOriginalTransactionStringId ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->getOriginalTransactionStringId()Ljava/lang/String;
																															 /* invoke-static/range {v0 ..v9}, Lcom/ansca/corona/JavaToNativeShim;->nativeStoreTransactionEvent(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
																															 /* :try_end_0 */
																															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																															 /* .line 299 */
																														 } // .end local v6 # "transactionTimeString":Ljava/lang/String;
																													 } // .end local v9 # "originalTransactionTimeString":Ljava/lang/String;
																													 /* :catchall_0 */
																													 /* move-exception v0 */
																													 /* monitor-exit v10 */
																													 /* throw v0 */
																												 } // .end method
																												 public static synchronized void tapEvent ( Integer p0, Integer p1, Integer p2 ) {
																													 /* .locals 2 */
																													 /* .param p0, "x" # I */
																													 /* .param p1, "y" # I */
																													 /* .param p2, "count" # I */
																													 /* .prologue */
																													 /* .line 179 */
																													 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																													 /* monitor-enter v0 */
																													 try { // :try_start_0
																														 com.ansca.corona.JavaToNativeShim .nativeTapEvent ( p0,p1,p2 );
																														 /* :try_end_0 */
																														 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																														 /* .line 180 */
																														 /* monitor-exit v0 */
																														 return;
																														 /* .line 179 */
																														 /* :catchall_0 */
																														 /* move-exception v1 */
																														 /* monitor-exit v0 */
																														 /* throw v1 */
																													 } // .end method
																													 public static synchronized void textEditingEvent ( Integer p0, Integer p1, Integer p2, java.lang.String p3, java.lang.String p4, java.lang.String p5 ) {
																														 /* .locals 2 */
																														 /* .param p0, "id" # I */
																														 /* .param p1, "startPos" # I */
																														 /* .param p2, "numDeleted" # I */
																														 /* .param p3, "newCharacters" # Ljava/lang/String; */
																														 /* .param p4, "oldString" # Ljava/lang/String; */
																														 /* .param p5, "newString" # Ljava/lang/String; */
																														 /* .prologue */
																														 /* .line 232 */
																														 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																														 /* monitor-enter v0 */
																														 try { // :try_start_0
																															 /* invoke-static/range {p0 ..p5}, Lcom/ansca/corona/JavaToNativeShim;->nativeTextEditingEvent(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
																															 /* :try_end_0 */
																															 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																															 /* .line 233 */
																															 /* monitor-exit v0 */
																															 return;
																															 /* .line 232 */
																															 /* :catchall_0 */
																															 /* move-exception v1 */
																															 /* monitor-exit v0 */
																															 /* throw v1 */
																														 } // .end method
																														 public static synchronized void textEvent ( Integer p0, Boolean p1, Boolean p2 ) {
																															 /* .locals 2 */
																															 /* .param p0, "id" # I */
																															 /* .param p1, "hasFocus" # Z */
																															 /* .param p2, "isDone" # Z */
																															 /* .prologue */
																															 /* .line 228 */
																															 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																															 /* monitor-enter v0 */
																															 try { // :try_start_0
																																 com.ansca.corona.JavaToNativeShim .nativeTextEvent ( p0,p1,p2 );
																																 /* :try_end_0 */
																																 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																 /* .line 229 */
																																 /* monitor-exit v0 */
																																 return;
																																 /* .line 228 */
																																 /* :catchall_0 */
																																 /* move-exception v1 */
																																 /* monitor-exit v0 */
																																 /* throw v1 */
																															 } // .end method
																															 public static synchronized void touchEvent ( Integer p0, Integer p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
																																 /* .locals 2 */
																																 /* .param p0, "x" # I */
																																 /* .param p1, "y" # I */
																																 /* .param p2, "xStart" # I */
																																 /* .param p3, "yStart" # I */
																																 /* .param p4, "type" # I */
																																 /* .param p5, "id" # I */
																																 /* .prologue */
																																 /* .line 184 */
																																 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																																 /* monitor-enter v0 */
																																 try { // :try_start_0
																																	 /* invoke-static/range {p0 ..p5}, Lcom/ansca/corona/JavaToNativeShim;->nativeTouchEvent(IIIIII)V */
																																	 /* :try_end_0 */
																																	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																	 /* .line 185 */
																																	 /* monitor-exit v0 */
																																	 return;
																																	 /* .line 184 */
																																	 /* :catchall_0 */
																																	 /* move-exception v1 */
																																	 /* monitor-exit v0 */
																																	 /* throw v1 */
																																 } // .end method
																																 public static synchronized void unloadResources ( ) {
																																	 /* .locals 2 */
																																	 /* .prologue */
																																	 /* .line 162 */
																																	 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																																	 /* monitor-enter v0 */
																																	 try { // :try_start_0
																																		 com.ansca.corona.JavaToNativeShim .nativeUnloadResources ( );
																																		 /* :try_end_0 */
																																		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																		 /* .line 163 */
																																		 /* monitor-exit v0 */
																																		 return;
																																		 /* .line 162 */
																																		 /* :catchall_0 */
																																		 /* move-exception v1 */
																																		 /* monitor-exit v0 */
																																		 /* throw v1 */
																																	 } // .end method
																																	 public static synchronized void useDefaultLuaErrorHandler ( ) {
																																		 /* .locals 2 */
																																		 /* .prologue */
																																		 /* .line 152 */
																																		 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																																		 /* monitor-enter v0 */
																																		 try { // :try_start_0
																																			 com.ansca.corona.JavaToNativeShim .nativeUseDefaultLuaErrorHandler ( );
																																			 /* :try_end_0 */
																																			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																			 /* .line 153 */
																																			 /* monitor-exit v0 */
																																			 return;
																																			 /* .line 152 */
																																			 /* :catchall_0 */
																																			 /* move-exception v1 */
																																			 /* monitor-exit v0 */
																																			 /* throw v1 */
																																		 } // .end method
																																		 public static synchronized void useJavaLuaErrorHandler ( ) {
																																			 /* .locals 2 */
																																			 /* .prologue */
																																			 /* .line 157 */
																																			 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																																			 /* monitor-enter v0 */
																																			 try { // :try_start_0
																																				 com.ansca.corona.JavaToNativeShim .nativeUseJavaLuaErrorHandler ( );
																																				 /* :try_end_0 */
																																				 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																				 /* .line 158 */
																																				 /* monitor-exit v0 */
																																				 return;
																																				 /* .line 157 */
																																				 /* :catchall_0 */
																																				 /* move-exception v1 */
																																				 /* monitor-exit v0 */
																																				 /* throw v1 */
																																			 } // .end method
																																			 public static synchronized void videoEndCallback ( Integer p0 ) {
																																				 /* .locals 2 */
																																				 /* .param p0, "id" # I */
																																				 /* .prologue */
																																				 /* .line 220 */
																																				 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																																				 /* monitor-enter v0 */
																																				 try { // :try_start_0
																																					 com.ansca.corona.JavaToNativeShim .nativeVideoEndCallback ( p0 );
																																					 /* :try_end_0 */
																																					 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																					 /* .line 221 */
																																					 /* monitor-exit v0 */
																																					 return;
																																					 /* .line 220 */
																																					 /* :catchall_0 */
																																					 /* move-exception v1 */
																																					 /* monitor-exit v0 */
																																					 /* throw v1 */
																																				 } // .end method
																																				 public static synchronized Boolean webPopupDidFailLoadUrl ( Integer p0, java.lang.String p1, java.lang.String p2, Integer p3 ) {
																																					 /* .locals 2 */
																																					 /* .param p0, "id" # I */
																																					 /* .param p1, "url" # Ljava/lang/String; */
																																					 /* .param p2, "msg" # Ljava/lang/String; */
																																					 /* .param p3, "code" # I */
																																					 /* .prologue */
																																					 /* .line 245 */
																																					 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																																					 /* monitor-enter v0 */
																																					 try { // :try_start_0
																																						 com.ansca.corona.JavaToNativeShim .nativeWebPopupDidFailLoadUrl ( p0,p1,p2,p3 );
																																						 /* :try_end_0 */
																																						 v1 = 																																						 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																						 /* monitor-exit v0 */
																																						 /* :catchall_0 */
																																						 /* move-exception v1 */
																																						 /* monitor-exit v0 */
																																						 /* throw v1 */
																																					 } // .end method
																																					 public static synchronized Boolean webPopupShouldLoadUrl ( Integer p0, java.lang.String p1 ) {
																																						 /* .locals 2 */
																																						 /* .param p0, "id" # I */
																																						 /* .param p1, "url" # Ljava/lang/String; */
																																						 /* .prologue */
																																						 /* .line 241 */
																																						 /* const-class v0, Lcom/ansca/corona/JavaToNativeShim; */
																																						 /* monitor-enter v0 */
																																						 try { // :try_start_0
																																							 com.ansca.corona.JavaToNativeShim .nativeWebPopupShouldLoadUrl ( p0,p1 );
																																							 /* :try_end_0 */
																																							 v1 = 																																							 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
																																							 /* monitor-exit v0 */
																																							 /* :catchall_0 */
																																							 /* move-exception v1 */
																																							 /* monitor-exit v0 */
																																							 /* throw v1 */
																																						 } // .end method
