class com.ansca.corona.CoronaSensorManager$AccelerometerMonitor$TimerHandler implements com.ansca.corona.MessageBasedTimer$Listener {
	 /* .source "CoronaSensorManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "TimerHandler" */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaSensorManager$AccelerometerMonitor this$1; //synthetic
/* # direct methods */
private com.ansca.corona.CoronaSensorManager$AccelerometerMonitor$TimerHandler ( ) {
/* .locals 0 */
/* .prologue */
/* .line 515 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.ansca.corona.CoronaSensorManager$AccelerometerMonitor$TimerHandler ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .param p2, "x1" # Lcom/ansca/corona/CoronaSensorManager$1; */
/* .prologue */
/* .line 515 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor$TimerHandler;-><init>(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)V */
return;
} // .end method
/* # virtual methods */
public void onTimerElapsed ( ) {
/* .locals 27 */
/* .prologue */
/* .line 518 */
v20 = com.ansca.corona.Controller .isValid ( );
/* if-nez v20, :cond_1 */
/* .line 568 */
} // :cond_0
} // :goto_0
return;
/* .line 523 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
v20 = /* invoke-static/range {v20 ..v20}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1400(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Z */
if ( v20 != null) { // if-eqz v20, :cond_0
/* .line 529 */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
v20 = /* invoke-static/range {v20 ..v20}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1500(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Z */
/* if-nez v20, :cond_2 */
/* .line 530 */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v21, v0 */
/* invoke-static/range {v21 ..v21}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1300(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* move-object/from16 v0, v21 */
/* iget-wide v0, v0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->timestamp:J */
/* move-wide/from16 v21, v0 */
/* invoke-static/range {v20 ..v22}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1602(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;J)J */
/* .line 531 */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* const/16 v21, 0x1 */
/* invoke-static/range {v20 ..v21}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1502(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;Z)Z */
/* .line 540 */
} // :cond_2
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* invoke-static/range {v20 ..v20}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1600(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)J */
/* move-result-wide v20 */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v22, v0 */
/* invoke-virtual/range {v22 ..v22}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->getInterval()Lcom/ansca/corona/TimeSpan; */
/* invoke-virtual/range {v22 ..v22}, Lcom/ansca/corona/TimeSpan;->getTotalMilliseconds()J */
/* move-result-wide v22 */
/* const-wide/32 v24, 0xf4240 */
/* mul-long v22, v22, v24 */
/* const-wide/16 v24, 0x2 */
/* div-long v22, v22, v24 */
/* add-long v16, v20, v22 */
/* .line 541 */
/* .local v16, "minSensorTimestamp":J */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* invoke-static/range {v20 ..v20}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1300(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* move-object/from16 v0, v20 */
/* iget-wide v0, v0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->timestamp:J */
/* move-wide/from16 v20, v0 */
/* move-wide/from16 v0, v20 */
/* move-wide/from16 v2, v16 */
v20 = com.ansca.corona.CoronaSensorManager .compareSensorTimestamps ( v0,v1,v2,v3 );
/* if-gtz v20, :cond_3 */
/* .line 542 */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* invoke-static/range {v20 ..v20}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1300(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v21, v0 */
/* invoke-static/range {v21 ..v21}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1600(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)J */
/* move-result-wide v21 */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v23, v0 */
/* invoke-virtual/range {v23 ..v23}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->getInterval()Lcom/ansca/corona/TimeSpan; */
/* invoke-virtual/range {v23 ..v23}, Lcom/ansca/corona/TimeSpan;->getTotalMilliseconds()J */
/* move-result-wide v23 */
/* const-wide/32 v25, 0xf4240 */
/* mul-long v23, v23, v25 */
/* add-long v21, v21, v23 */
/* move-wide/from16 v0, v21 */
/* move-object/from16 v2, v20 */
/* iput-wide v0, v2, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->timestamp:J */
/* .line 546 */
} // :cond_3
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* invoke-static/range {v20 ..v20}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1300(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* move-object/from16 v0, v20 */
/* iget-wide v0, v0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->timestamp:J */
/* move-wide/from16 v20, v0 */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v22, v0 */
/* invoke-static/range {v22 ..v22}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1600(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)J */
/* move-result-wide v22 */
/* invoke-static/range {v20 ..v23}, Lcom/ansca/corona/CoronaSensorManager;->subtractSensorTimestamps(JJ)J */
/* move-result-wide v13 */
/* .line 547 */
/* .local v13, "deltaTimeInNanoseconds":J */
/* long-to-double v0, v13 */
/* move-wide/from16 v20, v0 */
/* const-wide v22, 0x3e112e0be826d695L # 1.0E-9 */
/* mul-double v11, v20, v22 */
/* .line 548 */
/* .local v11, "deltaTimeInFractionalSeconds":D */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v21, v0 */
/* invoke-static/range {v21 ..v21}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1300(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* move-object/from16 v0, v21 */
/* iget-wide v0, v0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->timestamp:J */
/* move-wide/from16 v21, v0 */
/* invoke-static/range {v20 ..v22}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1602(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;J)J */
/* .line 553 */
com.ansca.corona.Controller .getController ( );
v15 = /* invoke-virtual/range {v20 ..v20}, Lcom/ansca/corona/Controller;->isNaturalOrientationPortrait()Z */
/* .line 554 */
/* .local v15, "isNaturalOrientationPortrait":Z */
if ( v15 != null) { // if-eqz v15, :cond_5
/* const/16 v18, 0x0 */
/* .line 555 */
/* .local v18, "xIndex":I */
} // :goto_1
if ( v15 != null) { // if-eqz v15, :cond_6
/* const/16 v19, 0x1 */
/* .line 556 */
/* .local v19, "yIndex":I */
} // :goto_2
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* invoke-static/range {v20 ..v20}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1300(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* move-object/from16 v0, v20 */
v0 = this.values;
/* move-object/from16 v20, v0 */
/* aget v20, v20, v18 */
/* move/from16 v0, v20 */
/* neg-float v0, v0 */
/* move/from16 v20, v0 */
/* move/from16 v0, v20 */
/* float-to-double v0, v0 */
/* move-wide/from16 v20, v0 */
/* const-wide/high16 v22, 0x4024000000000000L # 10.0 */
/* div-double v5, v20, v22 */
/* .line 557 */
/* .local v5, "xValue":D */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* invoke-static/range {v20 ..v20}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1300(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* move-object/from16 v0, v20 */
v0 = this.values;
/* move-object/from16 v20, v0 */
/* aget v20, v20, v19 */
/* move/from16 v0, v20 */
/* neg-float v0, v0 */
/* move/from16 v20, v0 */
/* move/from16 v0, v20 */
/* float-to-double v0, v0 */
/* move-wide/from16 v20, v0 */
/* const-wide/high16 v22, 0x4024000000000000L # 10.0 */
/* div-double v7, v20, v22 */
/* .line 558 */
/* .local v7, "yValue":D */
/* move-object/from16 v0, p0 */
v0 = this.this$1;
/* move-object/from16 v20, v0 */
/* invoke-static/range {v20 ..v20}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->access$1300(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* move-object/from16 v0, v20 */
v0 = this.values;
/* move-object/from16 v20, v0 */
/* const/16 v21, 0x2 */
/* aget v20, v20, v21 */
/* move/from16 v0, v20 */
/* neg-float v0, v0 */
/* move/from16 v20, v0 */
/* move/from16 v0, v20 */
/* float-to-double v0, v0 */
/* move-wide/from16 v20, v0 */
/* const-wide/high16 v22, 0x4024000000000000L # 10.0 */
/* div-double v9, v20, v22 */
/* .line 559 */
/* .local v9, "zValue":D */
/* if-nez v15, :cond_4 */
/* .line 560 */
/* const-wide/high16 v20, -0x4010000000000000L # -1.0 */
/* mul-double v7, v7, v20 */
/* .line 564 */
} // :cond_4
com.ansca.corona.Controller .getEventManager ( );
/* .line 565 */
/* .local v4, "eventManager":Lcom/ansca/corona/events/EventManager; */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 566 */
/* invoke-virtual/range {v4 ..v12}, Lcom/ansca/corona/events/EventManager;->accelerometerEvent(DDDD)V */
/* goto/16 :goto_0 */
/* .line 554 */
} // .end local v4 # "eventManager":Lcom/ansca/corona/events/EventManager;
} // .end local v5 # "xValue":D
} // .end local v7 # "yValue":D
} // .end local v9 # "zValue":D
} // .end local v18 # "xIndex":I
} // .end local v19 # "yIndex":I
} // :cond_5
/* const/16 v18, 0x1 */
/* .line 555 */
/* .restart local v18 # "xIndex":I */
} // :cond_6
/* const/16 v19, 0x0 */
} // .end method
