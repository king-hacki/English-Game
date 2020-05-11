import React, { Component } from 'react'
import {connect} from 'react-redux'
import { CardGroup } from 'semantic-ui-react'
import CardView from "./CardView";
import styled from 'styled-components'

const StyledCardGroup = styled(CardGroup)`

    background-color: white;
    width: 90%;
    height: 250px;
    margin: 50px auto 50px !important;
    border-radius: 2.5em;
    border: 8px solid #d3d2e1;
    box-shadow: 0 0 26px 2px #373636;

`

class Games extends Component {
    render() {
        return (
            <StyledCardGroup itemsPerRow={2} centered>
                <CardView name='Spelling' path='/home/spelling' color='Olive'></CardView>
                <CardView name='Fast Vocabulary' path='/home/fast_vocab' color='CadetBlue' ></CardView>
            </StyledCardGroup>
        )
    }
}

export default connect(null)(Games)