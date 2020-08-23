import React ,{useEffect, useState} from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Paper from '@material-ui/core/Paper';
import Grid from '@material-ui/core/Grid';
import axios from 'axios'
import Button from '@material-ui/core/Button';

import { useHistory } from "react-router-dom";
const useStyles = makeStyles((theme) => ({
  root: {
    '& > *': {
      margin: theme.spacing(1),
    },
    subcategoryTab:{
      margin:0,
      padding:0,
      color:"black"
    }
  },
}));

export default function Tabs(props) {
  const classes = useStyles();
  const [mainCategories, setMainCategories] = useState([]);
  const keyforEndPoint =props.mainCat;
 const history = useHistory();
 const [active,setActive]=useState(null)

  const fetchData = ()  => {
    const mainCategoriesApiEndPoint = 'http://localhost:8050/api/v1/category/'+keyforEndPoint+'/subcategory'
    console.log("check for props")

    console.log(props)
    console.log("inside tabs")

    const response =  axios.get(mainCategoriesApiEndPoint)
    .then(response => response.data)
    .then((data) => {
        setMainCategories(data);
        console.log("Fetch call")
        console.log(data)
    })
    console.log(mainCategories)
  }
  useEffect(() => {
      fetchData()
  },[])

  // function FormRow() {
  //   return (
  //     <React.Fragment>

  //       {console.log(mainCategories)}
  //       {mainCategories.map(singleSub=>(
  //        <Grid item xs={3}>
  //          <Paper elevation={0} xs={3} className={classes.paper}>{singleSub}</Paper>
  //        </Grid>
  //       // <li>{singleSub}</li>
  //       ))}
      
        
        {/* <Grid item xs={3}>
          <Paper elevation={0} className={classes.paper}>item</Paper>
        </Grid>
        <Grid item xs={3}>
          <Paper elevation={0} className={classes.paper}>item</Paper>
        </Grid>
        <Grid item xs={3}>
          <Paper elevation={0} className={classes.paper}>item</Paper>
        </Grid>
        <Grid item xs={3}>
          <Paper elevation={0} className={classes.paper}>item</Paper>
        </Grid> */}
        
  //     </React.Fragment>
  //   );
  // }
  function handleClick(singleSub){
    var a = singleSub.singleSub
    setActive(a)
    history.push(`/AudioSubCategory/Text%20Books/${singleSub.singleSub}/`)
      console.log(singleSub)
      window.location.reload()
      // fetchData();
      console.log("inside handleclick")
  }

  return (
    
     <div className={classes.root}>
       {console.log("hi from tabs")}
       {console.log(mainCategories)}
        {mainCategories.map(singleSub=>(
    //  <Grid item xs={3}>
            // 
            singleSub==props.subCat ? 
            <Button color="secondary" onClick={() => handleClick({singleSub})} className={classes.subcategoryTab} activeClassName="current">{singleSub}</Button>:
            <Button color="primary" onClick={() => handleClick({singleSub})} className={classes.subcategoryTab} activeClassName="current">{singleSub}</Button>
        // </Grid>
        // <li>{singleSub}</li>
        ))}
     {/* <Grid container spacing={3}> */}
          {/* <Grid container item xs={12} spacing={1}>
           <FormRow />
          </Grid> */}
         {/* <Grid container item xs={12} spacing={3}>
            <FormRow />
         </Grid> */}
          {/* <Grid container item xs={12} spacing={3}>
            <FormRow />
          </Grid>
       </Grid>  */}
     </div>
  );
}