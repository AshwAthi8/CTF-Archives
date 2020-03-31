    {
                NoRemove Objects
                {
                    ForceRemove Video
                    {
                        val classid = s 'clsid:61CECF11-FC3A-11D2-A1CD-005004602752'
                    }

                    ForceRemove WMPVideo
                    {
                        val classid = s 'clsid:61CECF11-FC3A-11D2-A1CD-005004602752'
                        val horizontalAlignment = s 'stretch' 
                        val verticalAlignment = s 'stretch' 
                        val zoom = s 'wmpprop:mediacenter.videoZoom'
                        val stretchToFit = s 'wmpprop:mediacenter.videoStretchToFit'
                        val backgroundColor = s 'black'
                    }
                }
            }
        }
    }
}

